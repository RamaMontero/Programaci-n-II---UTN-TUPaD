/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro_autor_editorial;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Editorial XYZ", "Calle Ficticia 123");
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Nacionalidad: " + libro.getAutor().getNacionalidad());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        System.out.println("Dirección: " + libro.getEditorial().getDireccion());
    }
}

