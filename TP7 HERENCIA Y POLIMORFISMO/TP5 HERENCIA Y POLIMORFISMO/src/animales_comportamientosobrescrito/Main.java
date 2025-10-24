/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_comportamientosobrescrito;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Rex"));
        animales.add(new Gato("Whiskers"));
        animales.add(new Vaca("Bessie"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();    
            System.out.println();     
        }
    }
}
