public class Ejercicio05 {
    public static void main(String[] args) {
        /*Ejercicio donde leamos por teclado dos tablas de 10 numeros enteros y mezclarlas en una
        tercera tabla de la forma: 1º de A, 1º de B, el 2º de A y el 2º de B, etc
        */
        int [] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arrayB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int [] arrayAux = new int [arrayA.length + arrayB.length];

        int k = 0;
        int z = 1;
        for(int i = 0; i < arrayA.length ; i++){
            arrayAux[i + k] = arrayA[i];
            arrayAux[i + z] = arrayB[i];
            k++;
            z++;
        }
        for (int i : arrayAux) {
            System.out.print(i + " ");
        }
    }
}
