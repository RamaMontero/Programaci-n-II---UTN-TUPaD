package tp2.programacion.estructurada;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rama Montero
 */
public class AnioBisiesto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un año: ");
            int anio = scanner.nextInt();
            
            boolean esBisiesto = false;
            
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                esBisiesto = true;
            }
            
            if (esBisiesto) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }
    }
}
