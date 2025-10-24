/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Ecommerce;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan");

        Producto producto1 = new Producto("Camiseta", 30.0);
        Producto producto2 = new Producto("Pantalón", 50.0);
        Producto producto3 = new Producto("Zapatos", 80.0);

        List<Producto> productos = Arrays.asList(producto1, producto2, producto3);

        PedidoNuevo pedido = new PedidoNuevo(cliente);
        pedido.setProductos(productos);

        double totalPedido = pedido.calcularTotal();
        System.out.println("Total del pedido: " + totalPedido);

        pedido.cambiarEstado("En preparación");
        pedido.cambiarEstado("Enviado");

        Pago pagoConTarjeta = new TarjetaCredito();
        pagoConTarjeta.procesarPago(totalPedido);

        PagoConDescuento pagoDescuento = new TarjetaCredito();
        Pago pago = (Pago) pagoDescuento;  

        pagoDescuento.aplicarDescuento(10);  
        pago.procesarPago(totalPedido - 10); 

        Pago pagoConPayPal = new PayPal();
        pagoConPayPal.procesarPago(totalPedido);
    }
}
