package main;

import config.ConexionBD;
import entities.Empresa;
import entities.DomicilioFiscal;
import service.EmpresaService;

import java.sql.Connection;
import java.sql.SQLException;

public class RollbackSimulado {

    public static void main(String[] args) {
        Connection conn = ConexionBD.getConnection();

        if (conn != null) {
            EmpresaService empresaService = new EmpresaService(conn);

            DomicilioFiscal domicilioFiscal = new DomicilioFiscal(
                    null, "Av. San Martin", 742, "CABA",
                    "Buenos Aires", "1234", "Argentina"
            );

            Empresa empresa = new Empresa(
                    null, "Mi Empresa SRL", "30-99999999-9", 
                    "Software", "info@empresa.com", domicilioFiscal
            );

            try {
                empresaService.crearEmpresaConDomicilioFiscal(empresa);
            } catch (SQLException e) {
                System.out.println("Se produjo un error: " + e.getMessage());
            }
        }
    }
}
