import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
         /**Pedir Dos numeros a usuario y determinar si son iguales o no.
         */
        int num1 = 0, num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();

        if(num1 == num2){
            System.out.println("The numbers enterd are equals.");
        }else{
            System.out.println("The numbers enterd are not equals.");
        }
    }
}
