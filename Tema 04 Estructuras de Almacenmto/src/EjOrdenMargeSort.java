

public class EjOrdenMargeSort{

    //Metodo MERGESORT  para ordenar el array de numeros A
    public static int [] mergesort(int [] a){
        //Caso base, si el array unicamente tiene 1 valor, ya está ordenado.
        if(a.length <= 1){
            return a;
        }else{
            int [] left;
            int [] right;
            
            left = new int[a.length / 2];
            right = new int[a.length - left.length];
            //Rellenamos ambas mitades.
            int i;
            for(i = 0; i < left.length; i++){
                left[i] = a[i];
            }
            int k = 0;
            for(int j = i; j < a.length; j++){
                right[k] = a[j];
                k++;
            }
            //Parte recursiva, volvemos a usar metodo Mergesort para ordenar los subconjuntos.
            int [] arrayOrdenado = merge(mergesort(left), mergesort(right));
            //Revolvemos ya el array ordenado.
            return arrayOrdenado;
        }
    }
    //Metodo Merge, recibe los subarrays y los une en uno ordenado. A y B deben estar ordenados.
    public static int [] merge(int [] a, int [] b){
        int i = 0;
        int j = 0;
        //array auxiliar para ir almacenando valores ordenados
        int [] c = new int[a.length + b.length];
        //Buble para las comparaciones por cada posición de "k"
        for(int k = 0; k < c.length; k++){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            if( i == a.length){
                k++;
                for(int z = j; z < b.length; z++){
                    c[k] = b[z];
                    k++;
                }
            }else if(j == b.length){
                k++;
                for(int x = i; x < a.length; x++){
                    c[k] = a[x];
                    k++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int [] s = {3, -4, 2, -87, 58, 20, 64, -125};

        int[] arrayprincipal = mergesort(s);
        for (int i : arrayprincipal) {
            System.out.print(i + " ");
        }
    }
}
