package service;

import dao.DomicilioFiscalDao;
import dao.EmpresaDao;
import entities.DomicilioFiscal;
import entities.Empresa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmpresaService {

    private final Connection conn;
    private final EmpresaDao empresaDao;
    private final DomicilioFiscalDao domicilioDao;

    public EmpresaService(Connection conn) {
        this.conn = conn;
        this.empresaDao = new EmpresaDao(conn);
        this.domicilioDao = new DomicilioFiscalDao(conn);
    }

    // Validaciones simples de dominio
    private void validarEmpresa(Empresa e) {
        if (e.getRazonSocial() == null || e.getRazonSocial().isBlank()) {
            throw new IllegalArgumentException("La razón social es obligatoria.");
        }
        if (e.getCuit() == null || e.getCuit().isBlank()) {
            throw new IllegalArgumentException("El CUIT es obligatorio.");
        }
        if (e.getEmail() != null && !e.getEmail().isBlank() && !e.getEmail().contains("@")) {
            throw new IllegalArgumentException("El email no tiene un formato válido.");
        }
    }

    /**
     * Crea Empresa + DomicilioFiscal en una misma transacción.
     */
    public void crearEmpresaConDomicilioFiscal(Empresa empresa) throws SQLException {
        validarEmpresa(empresa);
        empresa.setEliminado(false);
        if (empresa.getDomicilioFiscal() != null) {
            empresa.getDomicilioFiscal().setEliminado(false);
        }

        try {
            conn.setAutoCommit(false);

            // Verificar CUIT único
            Empresa existente = empresaDao.buscarPorCUIT(empresa.getCuit());
            if (existente != null) {
                throw new SQLException("CUIT duplicado. Ya existe una empresa con ese CUIT.");
            }

            // Crear empresa
            empresaDao.crear(empresa);

            // Crear domicilio asociado (1→1)
            DomicilioFiscal domicilio = empresa.getDomicilioFiscal();
            if (domicilio != null) {
                domicilioDao.crearConEmpresaId(domicilio, empresa.getId());
            }

            conn.commit();
            System.out.println("Empresa y domicilio fiscal creados correctamente.");
        } catch (SQLException | RuntimeException e) {
            System.out.println("Error al insertar los datos. Revirtiendo la transacción...");
            conn.rollback();
            throw e;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public List<Empresa> leerTodos() throws SQLException {
        List<Empresa> empresas = empresaDao.leerTodos();
        for (Empresa e : empresas) {
            DomicilioFiscal df = domicilioDao.leerPorEmpresaId(e.getId());
            e.setDomicilioFiscal(df);
        }
        return empresas;
    }

    public Empresa leerPorId(long id) {
        try {
            Empresa e = empresaDao.leerPorId(id);
            if (e != null) {
                DomicilioFiscal df = domicilioDao.leerPorEmpresaId(e.getId());
                e.setDomicilioFiscal(df);
            }
            return e;
        } catch (SQLException ex) {
            System.out.println("Error al leer la empresa: " + ex.getMessage());
            return null;
        }
    }

    public void actualizar(Empresa empresa) {
        try {
            validarEmpresa(empresa);
            empresaDao.actualizar(empresa);
            System.out.println("Empresa actualizada correctamente.");
        } catch (SQLException | RuntimeException ex) {
            System.out.println("Error al actualizar la empresa: " + ex.getMessage());
        }
    }

    public void eliminarLógico(long id) {
        try {
            empresaDao.eliminarLógico(id);
            System.out.println("Empresa eliminada lógicamente.");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar la empresa: " + ex.getMessage());
        }
    }

    public Empresa buscarPorCUIT(String cuit) throws SQLException {
        Empresa e = empresaDao.buscarPorCUIT(cuit);
        if (e != null) {
            DomicilioFiscal df = domicilioDao.leerPorEmpresaId(e.getId());
            e.setDomicilioFiscal(df);
        }
        return e;
    }
}
