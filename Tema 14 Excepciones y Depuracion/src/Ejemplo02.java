import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edad;

        try {
            System.out.println("Introduzca su edad: ");
            edad = sc.nextInt();
            sc.close();
            if(edad < 18){
                throw new Exception("La persona no es mayor de edad");
            }
        } catch (Exception e) {
            // Mostramos la causa del error
            System.out.println("Error: " + e.toString());
        }
    } 
}
