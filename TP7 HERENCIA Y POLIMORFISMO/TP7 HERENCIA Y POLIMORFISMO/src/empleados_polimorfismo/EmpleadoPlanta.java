/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_polimorfismo;

/**
 *
 * @author Rama Montero
 */
public class EmpleadoPlanta extends Empleado {
    private double salarioBase;

    public EmpleadoPlanta(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + 500; 
    }
}
