import java.util.Scanner;

public class Practica04 {
    //Funcion para rellenar un ARRAY
    public static void rellenarArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Introduzca numero: ");
            array[i] = sc.nextInt();
        }
        sc.close();
    }
    //Funcion para Imprimir el contenido
    public static void imprimirArray(int[] array){
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
    public static void main(String[] args) {
        //Creacion e impresion en base a Funciones.
        int[] array = new int[3];

        rellenarArray(array);
        imprimirArray(array);
    }
}
