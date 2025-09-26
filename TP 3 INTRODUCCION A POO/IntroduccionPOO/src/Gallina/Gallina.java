/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gallina;

/**
 *
 * @author Rama Montero
 */
public class Gallina {
        private final int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total huevos: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Edad actual: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-------------------------");
    }
}
