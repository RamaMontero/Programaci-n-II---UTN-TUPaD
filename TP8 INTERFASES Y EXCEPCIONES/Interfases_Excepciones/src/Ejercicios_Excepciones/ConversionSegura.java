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
public class ConversionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String entrada = scanner.nextLine();
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada inválida. Debes ingresar un número entero.");
        }
    }
}