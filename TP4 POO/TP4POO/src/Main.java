/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juan Pérez", "Gerente");
        Empleado e2 = new Empleado("María López", "Desarrolladora", 102, 40000);

        System.out.println(e1);
        System.out.println(e2);

        e1.actualizarSalarioPorcentaje(10);  
        e2.actualizarSalarioFijo(5000); 

        System.out.println("\nDespués de aumentar los salarios:");
        System.out.println(e1);
        System.out.println(e2);

        Empleado.mostrarTotalEmpleados();
    }
}