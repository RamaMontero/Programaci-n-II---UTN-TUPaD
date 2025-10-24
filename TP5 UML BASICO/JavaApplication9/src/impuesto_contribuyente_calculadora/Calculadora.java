/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto_contribuyente_calculadora;

/**
 *
 * @author Rama Montero
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double impuestoCalculado = monto * 0.21; 
        System.out.println("Impuesto calculado sobre " + monto + ": " + impuestoCalculado);
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
    }
}
