/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroMascota;

/**
 *
 * @author Rama Montero
 */
public class MainMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Amara", "Perro", 3);

        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
}
