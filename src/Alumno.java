import java.util.ArrayList;

public class Alumno {

    protected String nombre;
    protected int edad;
    protected ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula matricula) {
        matriculas.add(matricula);
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre);

        for (Matricula a : matriculas) {
            System.out.println("Asignatura: " + a.asignatura.nombre +
                    " Profesor: " + a.profesor.nombre +
                    " Nota: " + a.nota);
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
