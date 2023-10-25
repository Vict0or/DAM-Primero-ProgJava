import java.util.Scanner;

public class Practica03 {
    public static void main(String[] args) {
        /* Usaremos la entrada por teclado de usuario para rellenar un Array.
         */
        //Declaramos el Scanner:
        Scanner sc = new Scanner(System.in);

        //declaramos la Array.
        int[] my_array = new int[3];

        //Rellenamos el Array:
        for(int i = 0; i < my_array.length; i++){
            System.out.println("Introduzca numero: ");
            my_array[i] = sc.nextInt();
        }
        //Imprimimos valores:
        for(int j = 0; j < my_array.length; j++){
            System.out.println(my_array[j]);
        }
        sc.close();
    }
}
