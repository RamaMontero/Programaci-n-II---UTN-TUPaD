/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaveEspacial;

/**
 *
 * @author Rama Montero
 */
public class NaveEspacial {
        private final String nombre;
    private int combustible;
    private final int COMBUSTIBLE_MAXIMO = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, COMBUSTIBLE_MAXIMO); // por si se pasa
    }

    public void despegar() {
        System.out.println("La nave " + nombre + " ha despegado.");
    }

    public void avanzar(int distancia) {
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println("La nave avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede recargar una cantidad negativa o cero.");
            return;
        }

        if (combustible + cantidad > COMBUSTIBLE_MAXIMO) {
            System.out.println("Recarga excede el límite. Combustible ajustado al máximo.");
            combustible = COMBUSTIBLE_MAXIMO;
        } else {
            combustible += cantidad;
            System.out.println("Combustible recargado en " + cantidad + " unidades.");
        }
    }

    public void mostrarEstado() {
        System.out.println("===== Estado de la nave =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible actual: " + combustible + " / " + COMBUSTIBLE_MAXIMO);
        System.out.println("=============================");
    }
}

