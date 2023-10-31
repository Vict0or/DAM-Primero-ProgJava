public class Ejemplo01 {
    public static void main(String[] args) throws Exception {
        // Práctica de Excepciones
        int num1 = 3, num2 = 0;

        try {
            // Sabemos que esta division puede provocar errores, por lo que la 
            // capturamos en el bloque Try-Catch
            double division = num1 / num2;
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException error) {
            System.out.println("Error: " + error);
        }
    }
}
