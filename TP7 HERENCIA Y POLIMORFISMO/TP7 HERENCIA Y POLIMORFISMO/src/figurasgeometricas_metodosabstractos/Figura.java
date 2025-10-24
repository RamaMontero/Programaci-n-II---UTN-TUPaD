/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas_metodosabstractos;

/**
 *
 * @author Rama Montero
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre + ", Área: " + calcularArea());
    }
}
