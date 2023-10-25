import java.util.Scanner;

public class Task04{

    public static void compararNumeros(int num1, int num2){
        if(num1 > num2){
            System.out.println("Secuence: " + num1 + " " + num2);
        }else{
            System.out.println("Secuence: " + num2 + " " + num1);
        }
    }
    public static void main(String[] args){
        /*Pedir a usuario dos numeros y mostrarlos de mayor a menor.
         */
        int num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        sc.close();
        
        compararNumeros(num1, num2);
        
    }
}