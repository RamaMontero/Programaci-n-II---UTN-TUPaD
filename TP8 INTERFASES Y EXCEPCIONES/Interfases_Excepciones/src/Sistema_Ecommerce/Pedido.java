/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Ecommerce;
import java.util.List;

/**
 *
 * @author Rama Montero
 */
public class Pedido implements Pagable {
    private List<Producto> productos;

    public Pedido(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();  
        }
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
