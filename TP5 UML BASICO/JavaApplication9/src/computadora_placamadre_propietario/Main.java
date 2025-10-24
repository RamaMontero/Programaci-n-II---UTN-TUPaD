/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora_placamadre_propietario;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        PlacaMadre placaMadre = new PlacaMadre("ASUS Z390", "Intel Z390");
        Computadora computadora = new Computadora("Dell", "X123456789", placaMadre);
        Propietario propietario = new Propietario("Carlos López", "34567890");

        computadora.setPropietario(propietario);

        System.out.println("Computadora Marca: " + computadora.getMarca());
        System.out.println("Número de Serie: " + computadora.getNumeroSerie());
        System.out.println("Modelo de Placa Madre: " + computadora.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + computadora.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + computadora.getPropietario().getNombre());
        System.out.println("DNI del Propietario: " + computadora.getPropietario().getDni());
    }
}
