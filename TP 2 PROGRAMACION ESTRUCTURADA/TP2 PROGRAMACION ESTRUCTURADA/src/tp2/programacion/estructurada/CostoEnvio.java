/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.estructurada;

import java.util.Scanner;

/**
 *
 * @author Rama Montero
 */
public class CostoEnvio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = scanner.nextDouble();

            System.out.print("Ingrese el peso del paquete en kg: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea pendiente

            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            String zona = scanner.nextLine();

            double costoEnvio = calcularCostoEnvio(peso, zona);
            double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + totalCompra);
        }
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10 * peso;
        } else {
            System.out.println("Zona inválida. Se considerará costo de envío 0.");
            return 0;
        }
    }

    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}

