/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento_firmadigital_usuario;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos Mendoza", "carlos.mendoza@example.com");
        FirmaDigital firmaDigital = new FirmaDigital("a1b2c3d4e5", "2025-10-23", usuario);
        Documento documento = new Documento("Contrato de Trabajo", "Contenido del contrato...", firmaDigital);

        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Contenido: " + documento.getContenido());
        System.out.println("Firma Digital: " + documento.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha de Firma: " + documento.getFirmaDigital().getFecha());
        System.out.println("Usuario: " + documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email del Usuario: " + documento.getFirmaDigital().getUsuario().getEmail());
    }
}

