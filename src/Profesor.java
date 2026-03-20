public class Profesor extends Persona{

    protected String nombre;
    protected String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
