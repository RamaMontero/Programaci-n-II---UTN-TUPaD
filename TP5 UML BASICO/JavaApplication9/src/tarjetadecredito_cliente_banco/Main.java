/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetadecredito_cliente_banco;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nacional", "20-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/2025", banco);
        Cliente cliente = new Cliente("Juan Pérez", "12345678");

        cliente.asignarTarjeta(tarjeta);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Número de tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Fecha de vencimiento: " + cliente.getTarjeta().getFechaVencimiento());
        System.out.println("Banco: " + cliente.getTarjeta().getBanco().getNombre());
        System.out.println("CUIT del banco: " + cliente.getTarjeta().getBanco().getCuit());
    }
}
