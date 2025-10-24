/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_comportamientosobrescrito;

/**
 *
 * @author Rama Montero
 */
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre + ".");
    }
}