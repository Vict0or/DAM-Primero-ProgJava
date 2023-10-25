import java.util.Scanner;

public class Ejercicio03 {
    public static void caputarDatos(int[] array){
        Scanner sc = new Scanner(System.in);
        //Leemos los 5 numeros.
        for(int i = 0; i < array.length; i++){
            System.out.println("Introduzca numero:");
            array[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void mostrarMediaP(int[] array, int sumaP){
        int aux = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > 0){
                aux ++;
                sumaP += array[i];
            }
        }
        System.out.println("La media de los numeros POSITIVOS es: " + sumaP/aux);
    }
    public static void mostrarMediaN(int[] array, int sumaN){
        int aux = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < 0){
                aux ++;
                sumaN += array[i];
            }
        }
        System.out.println("La media de los numeros NEGATIVOS es: " + sumaN/aux);
    }
    public static void contarZeros(int[] array, int zeros){
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0){
                zeros ++;
            }
        }
        System.out.println("El total de 0 introducidos es: " + zeros);
    }
    public static void main(String[] args) {
        /* Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
        de los negativos y contar el número de ceros.
        */
        int zeros = 0, sumaP = 0, sumaN = 0;
        int array[] = new int[5];

        caputarDatos(array);
        mostrarMediaP(array, sumaP);
        mostrarMediaN(array, sumaN);
        contarZeros(array, zeros);
    }
}
