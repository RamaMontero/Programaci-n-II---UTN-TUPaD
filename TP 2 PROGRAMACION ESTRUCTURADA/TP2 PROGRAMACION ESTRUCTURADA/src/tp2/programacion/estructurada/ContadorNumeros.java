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
public class ContadorNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int numero = scanner.nextInt();
                
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }
            
            System.out.println("\nResultados:");
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }
    }
}
