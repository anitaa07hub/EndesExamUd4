package Colegio;

public class Persona {
    protected String nombre;

    /**
     *
     * @param nombre
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }
}
