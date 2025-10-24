/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva_cliente_mesa;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana García", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-25", "20:00", cliente, mesa);

        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Teléfono del Cliente: " + reserva.getCliente().getTelefono());
        System.out.println("Fecha de la Reserva: " + reserva.getFecha());
        System.out.println("Hora de la Reserva: " + reserva.getHora());
        System.out.println("Mesa: Número " + reserva.getMesa().getNumero() + " | Capacidad: " + reserva.getMesa().getCapacidad());
    }
}
