/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Excepciones;
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
/**
 *
 * @author Rama Montero
 */
public class ValidarEdad {
    public static void main(String[] args) {
        int edad = -5; // Ejemplo de edad inválida

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad);
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
