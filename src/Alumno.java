import java.util.ArrayList;

public class Alumno extends Persona {

    protected int edad;
    protected ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula matricula) {
        matriculas.add(matricula);
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
