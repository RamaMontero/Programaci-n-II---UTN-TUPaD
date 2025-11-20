/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;
import entities.DomicilioFiscal;
import entities.Empresa;
/**
 *
 * @author Rama Montero
 */
public class App {

    public static void main(String[] args) {

        DomicilioFiscal df = new DomicilioFiscal(
                1L, "Av. Siempre Viva", 742, "Springfield",
                "Buenos Aires", "1234", "Argentina"
        );

        Empresa e = new Empresa(
                1L, "Mi Empresa SRL", "30-99999999-9",
                "Software", "info@empresa.com",
                df
        );

        System.out.println(df);
        System.out.println(e);
    }
} 

