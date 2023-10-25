import java.util.Scanner;

public class EjOrdenBurbuja {
    //Metodo para Mostrar la array sin Ordenar:
    public static void mostrar(int[] arrayN){
        //Bucle For Each,
        int aux = 1;
        for(int elemento: arrayN){
            System.out.println("Elemento " + aux + "------> " + elemento);
            aux++;
        }
    }
    public static void ordenadoBurbuja(int[] arrayN){
        for(int i = 0; i < arrayN.length-1; i++){
            for(int j = 0; j < arrayN.length-1; j++){
                if(arrayN[j] > arrayN[j + 1]){
                    int temp = arrayN[j + 1];
                    arrayN[j + 1] = arrayN[j];
                    arrayN[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        /*Se pide un programa que pida un número (n) de elementos para guardar en un array, el 
        cual se llenará introduciendo números por teclado (usando la clase Scanner). El programa 
        deberá ordenar los números mediante el algoritmo de ordenación de Burbuja y los mostrará antes 
        y después de la ordenación.
        //Declaramos Variable para el tamaño de la Array:*/
        int tamaño = 0;

        //Declaramos el objeto para la entrada de datos:
        System.out.println("Introduzca tamaño: ");
        Scanner sc = new Scanner(System.in);
        tamaño = sc.nextInt();

        //Declaramos la array ya con la longitud definida.
        int [] arrayN = new int[tamaño];

        //Hacemos un bucle para rellenar el Array de numeros:
        for(int i = 0; i< arrayN.length; i++){
            System.out.println("Introduzca numero " + (i + 1) + ":");
            arrayN[i] = sc.nextInt();
        }
        sc.close();
        //Ahora mostramos la Array tal cual se introdujo:
        System.out.println("   - SIN ORDENAR");
        System.out.println("|----------------------|");
        //Llamamos al metodo mostrar.
        mostrar(arrayN);
        System.out.println("|----------------------|");

        //Ahora mostraremos la Array Ordenado con Met. Burbuja:
        System.out.println("    - ORDENADO");
        System.out.println("|----------------------|");
        ordenadoBurbuja(arrayN);
        mostrar(arrayN);
        System.out.println("|----------------------|");
    }
}
