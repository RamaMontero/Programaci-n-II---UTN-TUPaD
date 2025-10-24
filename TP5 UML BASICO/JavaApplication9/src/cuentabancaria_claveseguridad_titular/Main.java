/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria_claveseguridad_titular;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Titular titular = new Titular("Juan Pérez", "12345678");
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-10-20");
        CuentaBancaria cuenta = new CuentaBancaria("CBU123456789", 1000.50, clave, titular);

        // Mostrar información
        System.out.println("Cuenta Bancaria:");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave de Seguridad: " + cuenta.getClaveSeguridad().getCodigo());
        System.out.println("Última Modificación de la Clave: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("DNI del Titular: " + cuenta.getTitular().getDni());
    }
}

