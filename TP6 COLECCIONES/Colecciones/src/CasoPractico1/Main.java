/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

/**
 *
 * @author Rama Montero
 */
public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("001", "Arroz", 120, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Televisor", 1500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Camiseta", 350, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Sofá", 2500, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("005", "Laptop", 3000, 15, CategoriaProducto.ELECTRONICA);

        Inventario inventario = new Inventario();
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Listado de productos:");
        inventario.listarProductos();

        System.out.println("\nBuscar producto con ID 003:");
        Producto productoEncontrado = inventario.buscarProductoPorId("003");
        if (productoEncontrado != null) {
            productoEncontrado.mostrarInfo();
        }

        System.out.println("\nFiltrar productos por categoría ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\nEliminar producto con ID 002:");
        inventario.eliminarProducto("002");

        System.out.println("\nActualizar stock del producto con ID 003:");
        inventario.actualizarStock("003", 50);

        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        System.out.println("\nProducto con mayor stock:");
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        if (productoMayorStock != null) {
            productoMayorStock.mostrarInfo();
        }

        System.out.println("\nFiltrar productos con precio entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}
