import java.util.Scanner;

public class Ejercicio02 {
    public static void caputarDatos(int[] array){
        Scanner sc = new Scanner(System.in);
        //Leemos los 5 numeros. Los Almacenaremos directamente en orden inverso
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println("Introduzca numero:");
            array[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void mostrarArray(int[] array){
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
    }
    public static void main(String[] args) {
        /* Leer 5 numeros y mostrarlos en orden inverso al introducido.
         */
        int array[] = new int[5];
        caputarDatos(array);
        mostrarArray(array);
    }
}
