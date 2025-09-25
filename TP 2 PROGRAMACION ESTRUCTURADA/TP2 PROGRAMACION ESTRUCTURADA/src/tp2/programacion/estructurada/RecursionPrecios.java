/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Rama Montero
 */
public class RecursionPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }

    public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return; 
        }

        System.out.println("Precio: $" + precios[indice]);
        imprimirPreciosRecursivo(precios, indice + 1); 
    }
}
