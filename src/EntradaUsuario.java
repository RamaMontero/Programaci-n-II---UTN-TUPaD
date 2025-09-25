
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rama Montero
 */
public class EntradaUsuario {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in) 
        ) {
            
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt(); 
            System.out.println("Tu nombre es: " + nombre);
            System.out.println("Tu edad es: " + edad);
            
        }
    }
}
