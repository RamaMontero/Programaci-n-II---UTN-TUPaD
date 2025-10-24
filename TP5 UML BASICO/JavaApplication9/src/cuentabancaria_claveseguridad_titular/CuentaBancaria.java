/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria_claveseguridad_titular;

/**
 *
 * @author Rama Montero
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición con ClaveSeguridad
    private Titular titular; // Asociación bidireccional con Titular

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
        this.titular = titular;
        titular.setCuentaBancaria(this); // Establecer la relación bidireccional
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }
}

