import java.util.Scanner;

public class Task07 {
    public static void  main(String[] args) {
        /*Introducir un numero entre 0 y 9.999 - Mostrarlo con las cifras al reves.
         */
        int num = 0;
        int u = 0, d = 0, c = 0, um = 0, dm = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduca numero a analizar: ");
        num = sc.nextInt();

        sc.close();

        //UNIDAD
        u = num % 10;
        num = num / 10; //Eliminamos la unidad al pasarla a la parte decimal.

        //DECENA
        d = num % 10;
        num = num / 10;

        //CENTENA
        c = num % 10;
        num = num / 10;

        //UNIDAD DE MILLAR
        um = num % 10;
        num = num / 10;

        //DECENA DE MILLAR
        dm = num;

        //Imprimimos al reves.
        System.out.println("Este es el numero al reves: " + u + " " + d + " " + c + " " + um + " " + dm);
    }
    
}
