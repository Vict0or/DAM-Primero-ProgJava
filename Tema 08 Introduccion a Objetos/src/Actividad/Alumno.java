package Actividad;

public class Alumno {
    /*Vamos a realizar la implementación de la Clase Alumno, donde
    pasamos a definir los siguientes atributos/metodos/funciones.*/
    private String dni, nombre;
    private int edad, notaT1, notaT2, notaT3;

    //Constructor por defecto.
    public Alumno() {
        nombre = " ";
        dni = " ";
        edad = 0;
        notaT1 = 0;
        notaT2 = 0;
        notaT3 = 0;
    }
    //Constructor por parametros
    public Alumno(String dni, String nombre, int edad, int notaT1, int notaT2, int notaT3) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.notaT1 = notaT1;
        this.notaT2 = notaT2;
        this.notaT3 = notaT3;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getNotaT1() {
        return notaT1;
    }
    public void setNotaT1(int notaT1) {
        this.notaT1 = notaT1;
    }
    public int getNotaT2() {
        return notaT2;
    }
    public void setNotaT2(int notaT2) {
        this.notaT2 = notaT2;
    }
    public int getNotaT3() {
        return notaT3;
    }
    public void setNotaT3(int notaT3) {
        this.notaT3 = notaT3;
    }
    @Override
    public String toString() {
        return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", notaT1=" + notaT1 + ", notaT2=" + notaT2 + ", notaT3="
                + notaT3 + "]";
    }
    // Metodo para calculo de NOTA MEDIA
    public double sacarMedia() {
        double media = 0;
        media = (this.notaT1 + this.notaT2 + this.notaT3) / 3;
        return media;
    }
    public void mostrarMenu(){
       System.out.println("******************* MENU *************************");
       System.out.println("--------------------------------------------------");
       System.out.println("Indique el número de opcion que desea consultar: ");
       System.out.println("1. Ver Nombre Por Defecto.");
       System.out.println("2. Cambiar Nombre Por Defecto.");
       System.out.println("3. Ver DNI Por Defecto.");
       System.out.println("4. Cambiar DNI Por Defecto.");
       System.out.println("5. Ver Edad Por Defecto.");
       System.out.println("6. Ver Nota Media del Alumno.");
       System.out.println("0. SALIR DEL PROGRAMA.");
       System.out.println("--------------------------------------------------");
       System.out.println("--------------------------------------------------");
    }
}