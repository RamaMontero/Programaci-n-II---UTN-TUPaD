/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular_bateria_usuario;

/**
 *
 * @author Rama Montero
 */
public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void asignarCelular(Celular celular) {
        this.celular = celular;
        celular.setUsuario(this);
    }
}

