/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte_foto_titular;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("foto123.jpg", "JPG");
        Pasaporte pasaporte = new Pasaporte("123456789", "2025-10-01", foto);
        Titular titular = new Titular("Juan Pérez", "12345678");

        titular.asignarPasaporte(pasaporte);

        System.out.println(titular.getNombre() + " tiene el pasaporte con número: " + titular.getPasaporte().getNumero());
        System.out.println("El pasaporte tiene la foto: " + pasaporte.getFoto().getImagen());
        System.out.println("El titular del pasaporte es: " + pasaporte.getTitular().getNombre());
    }
}
