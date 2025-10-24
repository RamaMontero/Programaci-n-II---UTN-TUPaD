/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto_contribuyente_calculadora;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(1000, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}

