package Serializacion;

import java.io.Serializable;

public class Persona implements Serializable{
    // Definiremos atributos, metodos y constructores de la clase
    private static final long serialVersionUID = 1L;    // Establecemos la version, Importante para la serializacion.

    private String nif;
    private String nombre;
    private int edad;
    
    //Constructor por DEFECTO
    public Persona() {      
        nombre = " ";
        edad = 0;
    }
    /** Constructor por PARAMETROS
     * @param nif
     * @param nombre
     * @param edad
     */
    public Persona(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * @return the nif
     */
    public String getNif() {
        return nif;
    }
    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
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
        return "Persona [nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
