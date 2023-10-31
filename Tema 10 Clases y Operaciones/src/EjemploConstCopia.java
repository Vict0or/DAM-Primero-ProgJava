public class EjemploConstCopia {
    // Ejemplo constructor por Copia
    private String nombre, apellidos;
    private int edad;

    public EjemploConstCopia(){       // Constructor por Defecto
        nombre = " ";
        apellidos = " ";
        edad = 0;
    }

    public EjemploConstCopia(String nombre, String apellidos, int edad){  // Constructor por Parametros
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public EjemploConstCopia(EjemploConstCopia copiApp){
        nombre = copiApp.nombre;
        apellidos = copiApp.apellidos;
        edad = copiApp.edad;
    }

    public static void main(String[] args) throws Exception {
        // Instanciamos un obejot de nuestra clase, 
        EjemploConstCopia unaPersona = new EjemploConstCopia("Victor", "Rodriguez", 37);
        System.out.println("Info: " + unaPersona.toString());

        // Ahora instanciamos un obejto COPIA
        //EjemploConstCopia otraPersona = new EjemploConstCopia(unaPersona);
    }
}
