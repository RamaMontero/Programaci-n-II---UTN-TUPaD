package dao;

import entities.Empresa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDao implements GenericDao<Empresa> {

    private final Connection conn;

    public EmpresaDao(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void crear(Empresa empresa) throws SQLException {
        String sql = "INSERT INTO empresas " +
                "(razon_social, cuit, actividad_principal, email, eliminado) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, empresa.getRazonSocial());
            ps.setString(2, empresa.getCuit());
            ps.setString(3, empresa.getActividadPrincipal());
            ps.setString(4, empresa.getEmail());
            ps.setBoolean(5, empresa.getEliminado() != null ? empresa.getEliminado() : false);

            ps.executeUpdate();

            // Seteamos el ID generado
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    empresa.setId(rs.getLong(1));
                }
            }
        }
    }

    @Override
    public Empresa leerPorId(long id) throws SQLException {
        String sql = "SELECT * FROM empresas WHERE empresa_id = ? AND eliminado = false";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearEmpresa(rs);
                }
            }
        }
        return null;
    }

    @Override
    public List<Empresa> leerTodos() throws SQLException {
        List<Empresa> empresas = new ArrayList<>();
        String sql = "SELECT * FROM empresas WHERE eliminado = false";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                empresas.add(mapearEmpresa(rs));
            }
        }
        return empresas;
    }

    @Override
    public void actualizar(Empresa empresa) throws SQLException {
        String sql = "UPDATE empresas SET " +
                "razon_social = ?, cuit = ?, actividad_principal = ?, email = ?, eliminado = ? " +
                "WHERE empresa_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, empresa.getRazonSocial());
            ps.setString(2, empresa.getCuit());
            ps.setString(3, empresa.getActividadPrincipal());
            ps.setString(4, empresa.getEmail());
            ps.setBoolean(5, empresa.getEliminado() != null ? empresa.getEliminado() : false);
            ps.setLong(6, empresa.getId());

            ps.executeUpdate();
        }
    }

    @Override
    public void eliminarLógico(long id) throws SQLException {
        String sql = "UPDATE empresas SET eliminado = true WHERE empresa_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public Empresa buscarPorCUIT(String cuit) throws SQLException {
        String sql = "SELECT * FROM empresas WHERE cuit = ? AND eliminado = false";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cuit);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearEmpresa(rs);
                }
            }
        }
        return null;
    }

    private Empresa mapearEmpresa(ResultSet rs) throws SQLException {
        Empresa empresa = new Empresa();
        empresa.setId(rs.getLong("empresa_id"));
        empresa.setEliminado(rs.getBoolean("eliminado"));
        empresa.setRazonSocial(rs.getString("razon_social"));
        empresa.setCuit(rs.getString("cuit"));
        empresa.setActividadPrincipal(rs.getString("actividad_principal"));
        empresa.setEmail(rs.getString("email"));
        // El domicilio se carga desde DomicilioFiscalDao en el Service si se necesita
        return empresa;
    }
}