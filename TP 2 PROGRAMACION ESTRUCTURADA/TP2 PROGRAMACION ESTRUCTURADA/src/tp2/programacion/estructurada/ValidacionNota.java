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
public class ValidacionNota {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int nota;
            
            do {
                System.out.print("Ingrese una nota (0-10): ");
                nota = scanner.nextInt();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
                }
                
            } while (nota < 0 || nota > 10);
            
            System.out.println("Nota guardada correctamente.");
        }
    }
}
