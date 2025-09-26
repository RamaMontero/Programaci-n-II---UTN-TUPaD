/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Rama Montero
 */
public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        libro1.mostrarInfo();

        libro1.setAñoPublicacion(3000);  

        libro1.setAñoPublicacion(1985);  

        libro1.mostrarInfo();
    }
}
