/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_polimorfismo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan", 3000));
        empleados.add(new EmpleadoPlanta("Maria", 3200));
        empleados.add(new EmpleadoTemporal("Carlos", 120, 20)); 
        empleados.add(new EmpleadoTemporal("Ana", 150, 15)); 

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println(empleado.getClass().getSimpleName() + ": " + empleado.nombre);
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println(empleado.getClass().getSimpleName() + ": " + empleado.nombre);
            }
            empleado.mostrarInfo(); 
        }
    }
}
