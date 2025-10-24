/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo_motor_conductor;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "M1234567");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang", motor);
        Conductor conductor = new Conductor("Juan Pérez", "123456");

        vehiculo.setConductor(conductor);

        System.out.println("Vehículo: " + vehiculo.getPatente() + " - " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + " | Número de Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Licencia del Conductor: " + vehiculo.getConductor().getLicencia());
    }
}

