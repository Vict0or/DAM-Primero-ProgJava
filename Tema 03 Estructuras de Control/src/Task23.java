import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        /*Pedir un numero al usuario y calcular su Factorial.
         */
        int num = 0, contador = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber su factorial: ");
        num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++){
            contador *= i;
            if(i == num){
                System.out.print(i + " : ");
            }else{
                System.out.print(i + " x ");
            }
        }
        System.out.print(contador);
    }
    
}
