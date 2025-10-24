/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generardorqr_usuario_codigoqr;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana López", "ana.lopez@example.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR123456789", usuario);
    }
}

