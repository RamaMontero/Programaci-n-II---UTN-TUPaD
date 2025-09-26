/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroEstudiante;

/**
 *
 * @author Rama Montero
 */
public class main {
    public static void main(String[] args) {
        Estudiante estudiante1;
        estudiante1 = new Estudiante("Ramon", "Montero", "Programación", 7.5);

        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.0);
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
    }
}

