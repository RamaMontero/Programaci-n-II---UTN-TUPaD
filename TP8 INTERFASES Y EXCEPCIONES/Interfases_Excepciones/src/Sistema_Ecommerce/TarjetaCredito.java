/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Ecommerce;

/**
 *
 * @author Rama Montero
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con tarjeta de crédito: " + monto);
    }

    @Override
    public void aplicarDescuento(double descuento) {
        System.out.println("Descuento aplicado con tarjeta de crédito: " + descuento);
    }
}
