public class PracticaClasePersona {
    /* Crear clase Persona, añadiendo los atributos correspondientes y creado
        un metodo para luego instanciar un objeto.
     */
    //Atributos
    private String dni, nombre, apellidos;
    private int edad;

    // Constructor por DEFECTO
    public PracticaClasePersona(){
        dni = " ";
        nombre = " ";
        apellidos = " ";
        edad = 0;
    }
    //Constructor por PARAMETROS
    public PracticaClasePersona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //METODOS GETTERS / SETTERS
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //TO STRING
    @Override
    public String toString() {
        return "PracticaClasePersona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
    //Metodo que devolverá un saludo mas el nombre creado.
    public void saludar(){
        System.out.println("Hola soy " + this.nombre);
    }
}
