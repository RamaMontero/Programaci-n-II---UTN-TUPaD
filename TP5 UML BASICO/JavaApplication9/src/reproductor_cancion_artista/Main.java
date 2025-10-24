/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor_cancion_artista;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Luis Fonsi", "Pop");
        Cancion cancion = new Cancion("Despacito", artista);
        
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}

