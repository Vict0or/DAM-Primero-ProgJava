package ActividadDNI;

public class Main {
    /**Este metodo valida si un DN es correcto
     * @param DNI
     * @throws DNIException en caso de que no sea correcto lanzara la excepcion.
     */

     public static void validarDNI(String DNI) throws DNIException{
         //Vamos a coger solo la parte numerica del dni introducido,
         int DNISinLetra = Integer.valueOf(DNI.substring(0, 8));
         //Ahora cogeremos solo el ultimo caracter que será la letra,
         String letra = DNI.substring(8, 9);

         //Creamos un array con las posibles letras
         String[] letras = {"T", "R", "W", "A", "G", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

         int resto = DNISinLetra % 23;  // Guardamos en Resto el calculo del modulo, este valor nos da la posicion de la letra en el array.

         if(!letra.equals(letras[resto])){
             throw new DNIException("La letra del DNI no es correcta");
         }
     }
     public static void main(String[] args) {
         //Validamos un DNI correcto
        try {
            String DNI = "14952147D";
            validarDNI(DNI);
            System.out.println("El DNI " + DNI + " es correcto.");
        } catch (DNIException ex) {
            System.out.println("Error: " + ex.toString()); 
        }
        //Validamos un DNI INcorrecto
        try {
            String DNI = "14952147J";
            validarDNI(DNI);
            System.out.println("El DNI " + DNI + " es correcto.");
        } catch (DNIException ex) {
            System.out.println("Error: " + ex.toString()); 
        }
     }
}
