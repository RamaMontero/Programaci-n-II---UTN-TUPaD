package dao;

import entities.DomicilioFiscal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DomicilioFiscalDao {

    private final Connection conn;

    public DomicilioFiscalDao(Connection conn) {
        this.conn = conn;
    }

    /**
     * Crear un domicilio fiscal asociado a una empresa (1→1).
     */
    public void crearConEmpresaId(DomicilioFiscal domicilio, Long empresaId) throws SQLException {
        String sql = "INSERT INTO domicilios_fiscales " +
                "(empresa_id, calle, numero, ciudad, provincia, codigo_postal, pais, eliminado) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setLong(1, empresaId);
            ps.setString(2, domicilio.getCalle());
            ps.setInt(3, domicilio.getNumero());
            ps.setString(4, domicilio.getCiudad());
            ps.setString(5, domicilio.getProvincia());
            ps.setString(6, domicilio.getCodigoPostal());
            ps.setString(7, domicilio.getPais());
            ps.setBoolean(8, domicilio.getEliminado() != null ? domicilio.getEliminado() : false);

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    domicilio.setId(rs.getLong(1));
                }
            }
        }
    }

    public DomicilioFiscal leerPorEmpresaId(long empresaId) throws SQLException {
        String sql = "SELECT * FROM domicilios_fiscales WHERE empresa_id = ? AND eliminado = false";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, empresaId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearDomicilio(rs);
                }
            }
        }
        return null;
    }

    public DomicilioFiscal leerPorId(long domicilioId) throws SQLException {
        String sql = "SELECT * FROM domicilios_fiscales WHERE domicilio_id = ? AND eliminado = false";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, domicilioId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearDomicilio(rs);
                }
            }
        }
        return null;
    }

    public List<DomicilioFiscal> leerTodos() throws SQLException {
        List<DomicilioFiscal> lista = new ArrayList<>();
        String sql = "SELECT * FROM domicilios_fiscales WHERE eliminado = false";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearDomicilio(rs));
            }
        }
        return lista;
    }

    public void actualizar(DomicilioFiscal domicilio) throws SQLException {
        String sql = "UPDATE domicilios_fiscales SET " +
                "calle = ?, numero = ?, ciudad = ?, provincia = ?, codigo_postal = ?, pais = ?, eliminado = ? " +
                "WHERE domicilio_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, domicilio.getCalle());
            ps.setInt(2, domicilio.getNumero());
            ps.setString(3, domicilio.getCiudad());
            ps.setString(4, domicilio.getProvincia());
            ps.setString(5, domicilio.getCodigoPostal());
            ps.setString(6, domicilio.getPais());
            ps.setBoolean(7, domicilio.getEliminado() != null ? domicilio.getEliminado() : false);
            ps.setLong(8, domicilio.getId());

            ps.executeUpdate();
        }
    }

    public void eliminarLógico(long id) throws SQLException {
        String sql = "UPDATE domicilios_fiscales SET eliminado = true WHERE domicilio_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    private DomicilioFiscal mapearDomicilio(ResultSet rs) throws SQLException {
        DomicilioFiscal d = new DomicilioFiscal();
        d.setId(rs.getLong("domicilio_id"));
        d.setEliminado(rs.getBoolean("eliminado"));
        d.setCalle(rs.getString("calle"));
        d.setNumero(rs.getInt("numero"));
        d.setCiudad(rs.getString("ciudad"));
        d.setProvincia(rs.getString("provincia"));
        d.setCodigoPostal(rs.getString("codigo_postal"));
        d.setPais(rs.getString("pais"));
        return d;
    }
}