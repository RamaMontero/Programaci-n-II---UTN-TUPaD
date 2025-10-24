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
public class PedidoNuevo implements Pagable, Notificable {
    private String estado;
    private Notificable cliente;
    private List<Producto> productos;

    public PedidoNuevo(Notificable cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Producto> productos) {
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

    @Override
    public void notificarCambio(String mensaje) {
        cliente.notificarCambio(mensaje);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambio("El estado del pedido ha cambiado a: " + nuevoEstado);
    }
}
