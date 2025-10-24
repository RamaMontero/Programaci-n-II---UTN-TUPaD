/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas_metodosabstractos;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo(5);  
        figuras[1] = new Rectangulo(4, 6); 

        for (Figura figura : figuras) {
            figura.mostrarInfo();
        }
    }
}
