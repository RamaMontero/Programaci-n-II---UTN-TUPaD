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
public class CalculadoraDescuento {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precioOriginal = scanner.nextDouble();
            
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            char categoria = scanner.next().toUpperCase().charAt(0); // Convierte a mayúscula
            
            double descuento = 0;
            
            switch (categoria) {
                case 'A' -> descuento = 0.10;
                case 'B' -> descuento = 0.15;
                case 'C' -> descuento = 0.20;
                default -> {
                    System.out.println("Categoría inválida.");
                    scanner.close();
                    return;
                }
            }
            
            double montoDescuento = precioOriginal * descuento;
            double precioFinal = precioOriginal - montoDescuento;
            
            System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }
    }
}
