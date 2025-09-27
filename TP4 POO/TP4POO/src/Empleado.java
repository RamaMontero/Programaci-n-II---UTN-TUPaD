/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rama Montero
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(String nombre, String puesto, int id, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = id;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = ++totalEmpleados; 
        this.salario = 30000; 
        totalEmpleados++;
    }

    public void actualizarSalarioPorcentaje(double porcentaje) {
        this.salario += (this.salario * porcentaje / 100);
    }

    public void actualizarSalarioFijo(double aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario;
    }

    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados creados: " + totalEmpleados);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

