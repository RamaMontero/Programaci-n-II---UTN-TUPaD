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
public class DivisionEnteros {
    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            if (num2 != 0) {
                double resultado = num1 / num2;
                System.out.println("Resultado (decimal): " + resultado);
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        }
    }
}
