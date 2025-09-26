/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaveEspacial;

/**
 *
 * @author Rama Montero
 */
public class MainNaveEspacial {
      public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Capri", 50);

        nave1.mostrarEstado();

        nave1.despegar();
        nave1.avanzar(60); 

        nave1.recargarCombustible(30);  

        nave1.avanzar(60);  

        nave1.mostrarEstado();
    }
}

