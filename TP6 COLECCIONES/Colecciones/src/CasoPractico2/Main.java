/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico2;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "George Orwell", "Británico");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.agregarLibro("978-3-16-148410-0", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0-345-39180-3", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("978-0-452-28423-4", "1984", 1949, autor3);
        biblioteca.agregarLibro("978-0-7432-7356-5", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-0-452-28423-3", "Revolución en la granja", 1945, autor3);

        System.out.println("Lista de todos los libros:");
        biblioteca.listarLibros();

        System.out.println("\nBuscar libro por ISBN (978-3-16-148410-0):");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("978-3-16-148410-0");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("\nFiltrar libros publicados en 1949:");
        biblioteca.filtrarLibrosPorAnio(1949);

        System.out.println("\nEliminar libro con ISBN 978-0-7432-7356-5:");
        biblioteca.eliminarLibro("978-0-7432-7356-5");
        biblioteca.listarLibros();

        System.out.println("\nCantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\nAutores disponibles en la biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
    }
}

