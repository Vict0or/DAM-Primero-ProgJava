public abstract class Persona {
   /**
    * Clase abstracta para definir Persona.
    */
    private String nombre, apellidos;

    // Constructor por defecto
    public Persona(){
        nombre = " ";
        apellidos = " ";
    }
    /**
     * Constructor por Parametros
     * @param nombre
     * @param apellidos
     */
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }
    
    
}
