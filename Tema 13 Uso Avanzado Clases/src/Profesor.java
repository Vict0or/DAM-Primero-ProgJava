public class Profesor extends Persona {
    /**
     * Constructor por defecto heredado de PERSONA (ABSTRACT)
     */
    public Profesor() {
        super();
    }
    /**
     * Constructor por Parametros heredado de PERSONA (ABSTRACT)
     * @param nombre
     * @param apellidos
     */
    public Profesor(String nombre, String apellidos) {
        super(nombre, apellidos);
    }
    @Override
    public String toString() {
        return ("Datos del Profesor: " + super.toString());
    }
}

