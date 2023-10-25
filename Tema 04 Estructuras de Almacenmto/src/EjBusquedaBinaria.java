public class EjBusquedaBinaria {
    public static boolean Busqueda(int[]array, int elemento) {
        boolean encontrado = false;
        int inicio = 0;
        int fin = array.length - 1;
        int posicion_buscar;

        while(inicio <= fin && !encontrado){
            posicion_buscar = (inicio + fin / 2);
            if(array[posicion_buscar] == elemento){
                encontrado = true;
            }else{
                if(elemento > array[posicion_buscar]){
                    inicio = posicion_buscar + 1;
                }else{
                    fin = posicion_buscar - 1;
                }
            }
        }
        return encontrado;
    }
    public static void mostrarArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void comprobacion(boolean comprobacion){
        if(comprobacion == true){
            System.out.println("El numero se encuentra en el Array");
        }else{
            System.out.println("El numero NO se encuentra en el Array");
        }
    }
    public static void main(String[] args) {
        /*Ejemplo de implementacion de una busqueda Binaria en un array definido.
        */
        int [] array = new int[10];
        //Rellenamos el array
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        mostrarArray(array);
        System.out.println(" ");
        boolean comprobacion = Busqueda(array, 33);
        comprobacion(comprobacion);
    }
}
    
