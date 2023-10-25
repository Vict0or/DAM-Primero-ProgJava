import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //Pedir al Usuario un numero entre 0 y 9.999 - decir cuantas cifras tiene.

        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero a analizar: ");
        num = sc.nextInt();
        sc.close();
        //Comprobaciones
        if(num < 9999){
            if(num < 10){
                System.out.println("El numero introducido tiene 1 cifra");
            } else if (num < 100) {
                System.out.println("El numero introducido tiene 2 cifras");
            } else if (num < 1000) {
                System.out.println("El numero introducido tiene 3 cifras");
            }else {
                System.out.println("El numero introducido tiene 4 cifras");
            }
        }else {
            System.out.println("El numero introducido es erroneo.");
        }
        
    }
}
