import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        //Pedir un número N y mostrar todos los numeros desde 1 a N.

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        num =sc.nextInt();
        sc.close();

        //Bucle FOR para iterar desde 1 hasta el numero del usuario
        for (int i = 1; i <= num; i++){
            System.out.println(i + " ");
        }
    }
    
}
