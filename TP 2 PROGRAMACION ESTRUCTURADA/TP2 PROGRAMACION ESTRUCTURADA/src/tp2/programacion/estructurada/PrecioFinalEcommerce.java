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
public class PrecioFinalEcommerce {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el precio base del producto: ");
            double precioBase = scanner.nextDouble();
            
            System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
            double impuesto = scanner.nextDouble();
            
            System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
            double descuento = scanner.nextDouble();
            
            double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
            
            System.out.println("El precio final del producto es: " + precioFinal);
        }
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
}
