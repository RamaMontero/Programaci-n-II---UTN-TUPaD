package main;

import config.ConexionBD;
import entities.Empresa;
import entities.DomicilioFiscal;
import service.EmpresaService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AppMenu {

    private static final Connection conn = ConexionBD.getConnection();
    private static final EmpresaService empresaService = new EmpresaService(conn);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion;

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar un número de opción.");
                continue;
            }

            switch (opcion) {
                case 1 -> crearEmpresa(scanner);
                case 2 -> listarEmpresas();
                case 3 -> modificarEmpresa(scanner);
                case 4 -> eliminarEmpresa(scanner);
                case 5 -> buscarEmpresaPorCUIT(scanner);
                case 6 -> salir = true;
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        System.out.println("¡Programa finalizado!");
    }

    private static void mostrarMenu() {
        System.out.println("\n*** MENÚ DE OPCIONES ***");
        System.out.println("1️⃣ Crear Empresa");
        System.out.println("2️⃣ Listar Empresas");
        System.out.println("3️⃣ Modificar Empresa");
        System.out.println("4️⃣ Eliminar (baja lógica) Empresa");
        System.out.println("5️⃣ Buscar Empresa por CUIT");
        System.out.println("6️⃣ Salir");
        System.out.print("Elige una opción: ");
    }

    private static void crearEmpresa(Scanner scanner) {
        try {
            System.out.println("\n*** Crear Empresa ***");

            System.out.print("Razón Social: ");
            String razonSocial = scanner.nextLine();

            System.out.print("CUIT: ");
            String cuit = scanner.nextLine();

            System.out.print("Actividad Principal: ");
            String actividadPrincipal = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.println("\nIngrese los datos del Domicilio Fiscal:");
            System.out.print("Calle: ");
            String calle = scanner.nextLine();

            System.out.print("Número: ");
            int numero = Integer.parseInt(scanner.nextLine());

            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();

            System.out.print("Provincia: ");
            String provincia = scanner.nextLine();

            System.out.print("Código Postal: ");
            String codigoPostal = scanner.nextLine();

            System.out.print("País: ");
            String pais = scanner.nextLine();

            DomicilioFiscal domicilioFiscal = new DomicilioFiscal(
                    null, calle, numero, ciudad, provincia, codigoPostal, pais
            );
            Empresa empresa = new Empresa(
                    null, razonSocial, cuit, actividadPrincipal, email, domicilioFiscal
            );

            empresaService.crearEmpresaConDomicilioFiscal(empresa);
        } catch (NumberFormatException e) {
            System.out.println("El número de domicilio debe ser un entero válido.");
        } catch (SQLException e) {
            System.out.println("Error al crear la empresa: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Datos inválidos: " + e.getMessage());
        }
    }

    private static void listarEmpresas() {
        System.out.println("\n*** Listar Empresas ***");

        try {
            List<Empresa> empresas = empresaService.leerTodos();
            if (empresas.isEmpty()) {
                System.out.println("No hay empresas registradas.");
            } else {
                for (Empresa empresa : empresas) {
                    System.out.println(empresa);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las empresas: " + e.getMessage());
        }
    }

    private static void modificarEmpresa(Scanner scanner) {
        System.out.println("\n*** Modificar Empresa ***");

        try {
            System.out.print("Ingrese el ID de la empresa a modificar: ");
            long id = Long.parseLong(scanner.nextLine());

            Empresa empresa = empresaService.leerPorId(id);
            if (empresa != null) {
                System.out.println("Empresa encontrada: " + empresa);

                System.out.print("Nuevo Email (dejar vacío para no cambiar): ");
                String nuevoEmail = scanner.nextLine();
                if (!nuevoEmail.isBlank()) {
                    empresa.setEmail(nuevoEmail);
                }

                empresaService.actualizar(empresa);
            } else {
                System.out.println("Empresa no encontrada.");
            }
        } catch (NumberFormatException e) {
            System.out.println("El ID debe ser un número válido.");
        }
    }

    private static void eliminarEmpresa(Scanner scanner) {
        System.out.println("\n*** Eliminar Empresa (Baja Lógica) ***");

        try {
            System.out.print("Ingrese el ID de la empresa a eliminar: ");
            long id = Long.parseLong(scanner.nextLine());

            empresaService.eliminarLógico(id);
        } catch (NumberFormatException e) {
            System.out.println("El ID debe ser un número válido.");
        }
    }

    private static void buscarEmpresaPorCUIT(Scanner scanner) {
        System.out.println("\n*** Buscar Empresa por CUIT ***");

        System.out.print("Ingrese el CUIT de la empresa: ");
        String cuit = scanner.nextLine();

        try {
            Empresa empresa = empresaService.buscarPorCUIT(cuit);
            if (empresa != null) {
                System.out.println("Empresa encontrada: " + empresa);
            } else {
                System.out.println("Empresa no encontrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar la empresa: " + e.getMessage());
        }
    }
}