import java.util.Scanner;

public class Ejercicio04 {
    public static void caputarDatos(int[] arrayA){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arrayA.length; i++){
            System.out.println("Introduzca numero:");
            arrayA[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void mostrarArray(int[] arrayB){
        for (int elemento : arrayB) {
            System.out.print(elemento + " ");
        }
    }
    public static void ordenarArray(int[] arrayA, int[] arrayB){
        int posI = 0;
        int posF = arrayA.length - 1;

        for(int i = 0; i < arrayA.length; i++){
            if(posI == posF){
                float temp = (arrayA.length/2);
                int aux = (int)temp;
                arrayB[i] = arrayA[aux];
            }else{
                arrayB[i] = arrayA[posI];
                arrayB[i + 1] = arrayA[posF];
                posI++;
                posF--;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        /*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
        penúltimo, el tercero, etc.
        */
        int arrayA[] = new int[9];
        int arrayB[] = new int[9];
        System.out.println("A continuacion se le pedirán " + arrayA.length + " numeros.");
        caputarDatos(arrayA);
        System.out.println();
        ordenarArray(arrayA, arrayB);
        System.out.println("A continuacion se le mostrará la Array ordenada tal y comos se indica:");
        mostrarArray(arrayB);
    }
}
