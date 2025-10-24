/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedica_paciente_profesional;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana Gómez", "Federada");
        Profesional profesional = new Profesional("Dr. Luis Pérez", "Cardiólogo");
        CitaMedica citaMedica = new CitaMedica("2025-10-25", "10:30", paciente, profesional);

        System.out.println("Cita Médica:");
        System.out.println("Fecha: " + citaMedica.getFecha());
        System.out.println("Hora: " + citaMedica.getHora());
        System.out.println("Paciente: " + citaMedica.getPaciente().getNombre());
        System.out.println("Obra Social del Paciente: " + citaMedica.getPaciente().getObraSocial());
        System.out.println("Profesional: " + citaMedica.getProfesional().getNombre());
        System.out.println("Especialidad del Profesional: " + citaMedica.getProfesional().getEspecialidad());
    }
}

