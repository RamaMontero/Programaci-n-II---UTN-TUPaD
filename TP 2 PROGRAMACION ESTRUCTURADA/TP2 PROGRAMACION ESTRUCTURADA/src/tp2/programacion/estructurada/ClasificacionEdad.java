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
public class ClasificacionEdad {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            if (edad < 12) {
                System.out.println("Eres un Niño.");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("Eres un Adolescente.");
            } else if (edad >= 18 && edad <= 59) {
                System.out.println("Eres un Adulto.");
            } else if (edad >= 60) {
                System.out.println("Eres un Adulto mayor.");
            } else {
                System.out.println("Edad inválida.");
            }
        }
    }
}
