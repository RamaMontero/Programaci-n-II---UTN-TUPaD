package CasoPractico3;

/**
 * 
 * 
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Tecnología Universitaria");

        Profesor profesor1 = new Profesor("P001", "Juan Pérez", "Matemáticas");
        Profesor profesor2 = new Profesor("P002", "Ana Gómez", "Física");
        Profesor profesor3 = new Profesor("P003", "Carlos Díaz", "Química");

        Curso curso1 = new Curso("C001", "Álgebra");
        Curso curso2 = new Curso("C002", "Cálculo");
        Curso curso3 = new Curso("C003", "Física 1");
        Curso curso4 = new Curso("C004", "Química Orgánica");
        Curso curso5 = new Curso("C005", "Física 2");

        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");

        System.out.println("Cursos y sus profesores:");
        universidad.listarCursos();

        System.out.println("\nProfesores y sus cursos:");
        universidad.listarProfesores();

        universidad.asignarProfesorACurso("C002", "P002");

        System.out.println("\nDespués de cambiar el profesor del curso C002:");
        universidad.listarCursos();

        universidad.eliminarCurso("C003");

        System.out.println("\nDespués de eliminar el curso C003:");
        universidad.listarCursos();

        universidad.eliminarProfesor("P002");

        System.out.println("\nDespués de eliminar el profesor P002:");
        universidad.listarProfesores();

        System.out.println("\nReporte de cantidad de cursos por profesor:");
        universidad.mostrarReporte();
    }
}
