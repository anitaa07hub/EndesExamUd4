import java.util.ArrayList;

public class Curso {

    protected String nombre;
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<Asignatura> asignaturas;
    protected ArrayList<Profesor> profesores;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
        asignaturas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void mostrarTodo() {
        System.out.println("CURSO: " + nombre);

        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.nombre);
        }

        for (Asignatura asignatura : asignaturas) {
            System.out.println("Asignatura: " + asignatura.nombre);
        }

        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.nombre);
        }
    }
}
