import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /* Leer un numero, repetir el proceso hasta que se introduzca un numero
        negativo.
        */
        int num = 0;
        boolean aux = true;

        while(aux == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un número positivo: ");
            num = sc.nextInt();
            sc.close();
            if(num < 0){
                aux = false;
            }
        }
    }
    
}
