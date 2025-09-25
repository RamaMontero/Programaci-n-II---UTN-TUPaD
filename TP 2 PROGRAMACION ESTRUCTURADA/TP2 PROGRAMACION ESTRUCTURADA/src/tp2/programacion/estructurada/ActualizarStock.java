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
public class ActualizarStock {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el stock actual del producto: ");
            int stockActual = scanner.nextInt();
            
            System.out.print("Ingrese la cantidad vendida: ");
            int cantidadVendida = scanner.nextInt();
            
            System.out.print("Ingrese la cantidad recibida: ");
            int cantidadRecibida = scanner.nextInt();
            
            int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            
            System.out.println("El nuevo stock del producto es: " + nuevoStock);
        }
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
