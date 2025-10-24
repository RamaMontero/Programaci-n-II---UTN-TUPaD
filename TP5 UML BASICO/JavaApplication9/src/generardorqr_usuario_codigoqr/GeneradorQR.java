/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generardorqr_usuario_codigoqr;

/**
 *
 * @author Rama Montero
 */
public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Se generó el código QR con valor: " + codigo.getValor());
        System.out.println("Asignado al usuario: " + codigo.getUsuario().getNombre());
        System.out.println("Email del usuario: " + codigo.getUsuario().getEmail());
    }
}

