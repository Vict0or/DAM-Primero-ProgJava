import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*Pedir 15 numeros y escribir la suma total
         */
        int num = 0, contador = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 15; i++){
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();
            contador += num;
        }
        System.out.println("La suma total de los 15 numeros introducidos es: " + contador);
        sc.close();
    }
    
}
