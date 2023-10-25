public class Ejercicio06 {
    public static void rellenarMatriz(int [] matriz){
        for(int i = 0; i < matriz.length; i ++){
            matriz[i] = i;
        }
    }
    public static void mostrarMatriz(int [] matriz){
        for(int elemento : matriz){
            System.out.print(elemento + " ");
        }
    }
    public static boolean encontado(int [] matriz, int valorB){
        // Funcion para comprobar si el valor buscado se encuentra en la matriz.
        boolean valor =  false;
        for(int i = 0; i < matriz.length; i++){
            if(matriz[i] == valorB){
                valor = true;
                break;
            }
        }
        return valor;
    }
    public static void resultado(boolean encontradisimo, int valorB){
        if(encontradisimo){
            System.out.println("El valor buscado es " + valorB + " y se encuentra  en el Array");
        }else{
            System.out.println("El valor buscado es " + valorB + " y no se encuentra en el Array");
        }
    }

    public static void main(String[] args) {
        /*Crea un programa que diga si un elemento existe en un array. Haremos todo lo posible en
        metodos para practicarlos.Usaremos el metodo Busqueda Lineal.
        */
                boolean encontradisimo = false;
        int valorB = 12;
        int[] matriz = new int[10];

        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println(" ");
        encontradisimo = encontado(matriz, valorB);
        System.out.println(encontradisimo);
        resultado(encontradisimo, valorB);

    }
}
