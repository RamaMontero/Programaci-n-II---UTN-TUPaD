package miprimerproyecto;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rama Montero
 */
public class OperacionesBasicas {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Ingresa el primer número entero: ");
            int numero1 = scanner.nextInt();
            
            System.out.print("Ingresa el segundo número entero: ");
            int numero2 = scanner.nextInt();
            
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            
            double division = 0;
            if (numero2 != 0) {
                division = (double) numero1 / numero2; 
            }
            
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            
            if (numero2 != 0) {
                System.out.println("División: " + division);
            } else {
                System.out.println("División: No se puede dividir por cero");
            }
        }
    }
}
