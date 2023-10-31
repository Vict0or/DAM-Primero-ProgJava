public class Alumno extends Persona {

    /**
     * Constructor por defecto heredado de PERSONA (ABSTRACT)
     */
    public Alumno() {
        super();
    }
    /**
     * Constructor por Parametros heredado de PERSONA (ABSTRACT)
     * @param nombre
     * @param apellidos
     */
    public Alumno(String nombre, String apellidos) {
        super(nombre, apellidos);
    }
    @Override
    public String toString() {
        return ("Datos del alumno: " + super.toString());
    }
}
