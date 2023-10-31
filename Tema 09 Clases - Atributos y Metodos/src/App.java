public class App {

    // Este pequeño programa servira para ver como usar las variables STATIC.
    //private String marca, modelo, matricula;
   // private double precio;

    // Variable estatica
    static double descuento = 1500;

    public static void main(String[] args) throws Exception {
        // Instanciamos un objeto de la clase
        //Pricipal coche = new Pricipal();

        System.out.println("El descuento es de: " + Pricipal.descuento);
        System.out.println("El descuento es de: " + Pricipal.descuento);

        /**Como vemos, podemos acceder tanto desde la propia clase como desde el objeto.
        Este tipo de variables, hacen la funcion de "constantes"y serán visibles para todos 
        los objetos de la clase
        */
    }
}
