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
public class SumaPares {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int sumaPares = 0;
            
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            while (numero != 0) {
                if (numero % 2 == 0) {
                    sumaPares += numero;
                }
                
                System.out.print("Ingrese un número (0 para terminar): ");
                numero = scanner.nextInt();
            }
            
            System.out.println("La suma de los números pares es: " + sumaPares);
        }
    }
}
