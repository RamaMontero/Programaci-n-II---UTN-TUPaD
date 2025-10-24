/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular_bateria_usuario;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Batería bateria = new Batería("Modelo X", 4000);
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria);
        Usuario usuario = new Usuario("Juan Pérez", "12345678");

        usuario.asignarCelular(celular);

        System.out.println(usuario.getNombre() + " tiene el celular " + usuario.getCelular().getMarca());
        System.out.println("El celular tiene batería de modelo: " + celular.getBateria().getModelo());
        System.out.println("El usuario del celular es: " + celular.getUsuario().getNombre());
    }
}
