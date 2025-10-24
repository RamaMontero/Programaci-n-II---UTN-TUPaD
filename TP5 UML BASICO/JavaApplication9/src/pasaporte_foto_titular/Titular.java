/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte_foto_titular;

/**
 *
 * @author Rama Montero
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void asignarPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        pasaporte.setTitular(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
}

