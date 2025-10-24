package CasoPractico3;

/**
 *
 * 
 * @author Rama Montero
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor != profesor) {
            if (this.profesor != null) {
                this.profesor.eliminarCurso(this);
            }
            this.profesor = profesor;
            if (profesor != null) {
                profesor.agregarCurso(this);
            }
        }
    }

    public void mostrarInfo() {
        if (profesor != null) {
            System.out.println(codigo + " - " + nombre + ", Profesor: " + profesor.getNombre());
        } else {
            System.out.println(codigo + " - " + nombre + ", Sin profesor asignado.");
        }
    }
}
