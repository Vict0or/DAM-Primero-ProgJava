

public class EjOrdenInserccion {
    public static void mostrar(int[] arrayN){
        //Bucle For Each,
        for(int elemento: arrayN){
            System.out.print(elemento + " ");
        }
    }
    public static void ordenadoInserccion(int[] arrayN){
        /* Bucle para ir recorriendo el array, establecemos KEY como valor a comparar
        y j como el siguiente valor con el que comparamos.
        */
        for(int i = 0; i < arrayN.length; i++){
            int key = arrayN[i];
            int j = i -1;
            /*Con el bucle while, movemos los elementos que son mayores que el 
            que estamos companrando a una posicion mas a la derecha de su posicion 
            actual.
            */
            while(j >= 0 && arrayN[j] > key){
                arrayN[j +1] = arrayN[j];
                j -= 1;
            }
            arrayN[j + 1] = key;
        }
    }
    public static void main(String[] args) {
         /*Se pide un programa que dado un array de X tamaño y valores, deberá ordenar los números 
        mediante el algoritmo de ordenación de Insercción y los mostrará antes y después de la ordenación.*/
        //Declaramos la array ya con la longitud definida.
        int [] arrayN = {5, 9, 20, 35, 6};

        //Ahora mostramos la Array tal cual se introdujo:
        System.out.println("   - SIN ORDENAR");
        System.out.println("|----------------------|");
        //Llamamos al metodo mostrar.
        mostrar(arrayN);
        System.out.println();
        //Ahora mostraremos la Array Ordenado con Met. Seleccion:
        System.out.println("    - ORDENADO");
        System.out.println("|----------------------|");
        ordenadoInserccion(arrayN);
        mostrar(arrayN);
    }
}
