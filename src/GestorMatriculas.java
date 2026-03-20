import java.util.ArrayList;

public class GestorMatriculas implements Mostrable{

    protected ArrayList<Matricula> matriculas;

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    public void crearMatricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula matricula = new Matricula(alumno, asignatura, profesor, nota);

        matriculas.add(matricula);

        alumno.matricular(matricula);
    }


    public void mostrarAprobados() {
        for (Matricula matricula : matriculas) {
            if (matricula.nota >= 5) {
                System.out.println("APROBADO: " + matricula.alumno.nombre);
            }
        }
    }

    public void subirNotaTodos(double puntos) {
        for (Matricula matricula : matriculas) {
            matricula.nota = matricula.nota + puntos;

            if (matricula.nota > 10) {
                matricula.nota = 10;
            }
        }
    }

    public double mediaGlobal() {
        double suma = 0;

        for (Matricula matricula : matriculas) {
            suma += matricula.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }

    @Override
    public void mostrar() {
        for (Matricula matricula : matriculas) {
            System.out.println(
                    matricula.alumno.nombre + " - " +
                            matricula.asignatura.nombre + " - " +
                            matricula.profesor.nombre + " - " +
                            matricula.nota
            );
        }
    }
}
