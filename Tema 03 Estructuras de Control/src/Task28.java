import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        /* Dibujar un cuadrado de lado N utilizando *
         */
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n =  sc.nextInt();

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}
