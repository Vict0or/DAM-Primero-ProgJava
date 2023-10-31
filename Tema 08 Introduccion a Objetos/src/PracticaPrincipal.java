public class PracticaPrincipal {
    public static void main(String[] args) {

        //Instanciamos objeto
        PracticaClasePersona juan = new PracticaClasePersona();

        juan.setNombre("Juanito");
        
        //Invocamos metodo creado para saludor.
        juan.saludar();

        /* En el anterior ejemplo, solo tendra valor el atributo nombre, el resto
         * no imprimirá informacion ya que no hemos establecido valores.
         */

        // Ahora hacemos uso del constructor por PARAMETROS, para dar valores a todos
        // los atributos
        PracticaClasePersona david = new PracticaClasePersona("David", "123456987", "DeMarco", 35);

        // Hacemos uso del metodo SALUDAR para esta nueva instancia.
        david.saludar();

        // En esta instancia del objeto DAVID si que podemos imprimir todos los valores dados
        System.out.println(david.getNombre() + " " + david.getApellidos() + " " + david.getEdad());

        // Tambien podemos hacer uso del metodo ToString
        david.toString();
    }
}
