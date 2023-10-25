public class EjBusquedaLineal {
    //Metodo que buscara y devolverá VERDERO o FALSO si lo encuentra
    public static boolean Busqueda(int[] array, int elemento){
        boolean encontrado = false;
        for (int i = 0; i < array.length && !encontrado; i++){
            if(array[i] == elemento){
                encontrado = true;
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
            /*Ejemplo de implementacion de una busqueda lineal en un array definido.
            */
            int [] array = new int[10];
            //Rellenamos el array
            for (int i = 0; i < array.length; i++){
                array[i] = i + 1;
            }
            mostrarArray(array);
            System.out.println(" ");
            boolean comprobacion = Busqueda(array, 22);
            comprobacion(comprobacion);
        }
    }
    