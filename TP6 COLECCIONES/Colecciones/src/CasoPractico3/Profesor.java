package CasoPractico3;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un profesor de la universidad, incluyendo su ID, nombre, especialidad
 * y los cursos que tiene asignados.
 * 
 * @author Rama Montero
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;  // Aquí devolvemos la lista de cursos asignados al profesor
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + id + ")");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos asignados: " + cursos.size());
    }
}
