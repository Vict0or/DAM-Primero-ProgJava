package QB4;

public class Alumno {
    private String apellido, nombre;
    private int edad;
    /**
     * Contructor por Defecto
     */
    public Alumno() {
        edad = 0;
        apellido = "";
        nombre = "";
    }
    /**
     * @param apellido
     * @param nombre
     * @param edad
     */
    public Alumno(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Alumno [apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + "]";
    }   
}
