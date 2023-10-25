public class Task26 {
    public static void main(String[] args) {
        /*Mostrar una traza del siguiente programa y muestra cual seria la salida por
        pantalla:
            PROGRAMA ej_1
            VARIABLES
            i, j: ENTERO
            COMIENZO
                PARA i <- 1 HASTA 3
                    j <- i+1
                    MIENTRAS j < 4
                        escribir (j-i)
                        j <- j+1
                    FIN MIENTRAS
                FIN PARA
            FIN
        */
        int i, j = 0;
        for(i = 1; i < 3; i++){
            j = i + 1;
            while(j < 4){
                System.out.print(j - i);
                j += 1;
            }
        }
    }
}
