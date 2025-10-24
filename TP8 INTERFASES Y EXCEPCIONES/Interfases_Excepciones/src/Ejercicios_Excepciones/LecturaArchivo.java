/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Excepciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Rama Montero
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("ejemplo.txt");
            try (Scanner lector = new Scanner(archivo)) {
                while (lector.hasNextLine()) {
                    String linea = lector.nextLine();
                    System.out.println(linea);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}
