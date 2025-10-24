/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Excepciones;
import java.util.Scanner;
/**
 *
 * @author Rama Montero
 */

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Introduce el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}