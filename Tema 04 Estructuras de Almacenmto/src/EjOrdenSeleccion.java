

public class EjOrdenSeleccion {
    public static void mostrar(int[] arrayN){
        //Bucle For Each,
        for(int elemento: arrayN){
            System.out.print(elemento + " ");
        }
    }
    public static void ordenadoSeleccion(int[] arrayN){
        /* Bucle para ir moviendo los limites entre parte ordenada y parte
        aun por ordenar.*/
        for(int i = 0; i < arrayN.length-1; i++){
            int min_inx = i;
            for(int j = i + 1; j < arrayN.length; j++)
                if(arrayN[j] < arrayN[min_inx])
                    min_inx = j;
                
            int temp = arrayN[min_inx];
            arrayN[min_inx] = arrayN[i];
            arrayN[i] = temp;
            mostrar(arrayN);            //Mostramos para ir viendo como va ordenando.
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /**Se pide un programa que dado un array de X tamaño y valores, deberá ordenar los números 
        mediante el algoritmo de ordenación de Seleccion y los mostrará antes y después de la ordenación.
        */
        //Declaramos la array ya con la longitud definida.
        int [] arrayN = {21, 5, 9, 20, 35, 6};

        //Ahora mostramos la Array tal cual se introdujo:
        System.out.println("   - SIN ORDENAR");
        System.out.println("|----------------------|");
        //Llamamos al metodo mostrar.
        mostrar(arrayN);
        System.out.println();
        //Ahora mostraremos la Array Ordenado con Met. Seleccion:
        System.out.println("    - ORDENADO");
        System.out.println("|----------------------|");
        ordenadoSeleccion(arrayN);
        mostrar(arrayN);

    }
}

    