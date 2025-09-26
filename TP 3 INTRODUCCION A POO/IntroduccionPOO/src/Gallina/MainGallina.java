/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gallina;

/**
 *
 * @author Rama Montero
 */
public class MainGallina {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 3);

        gallina1.mostrarEstado();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.mostrarEstado();

        gallina2.mostrarEstado();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.mostrarEstado();
    }
}

