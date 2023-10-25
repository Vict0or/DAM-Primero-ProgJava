public class Task27 {
    public static void main(String[] args) {
        /*Aplicacion que muestre las tablas de multiplicar del 1 al 10.
         */
        int i, j = 0;
        for(i = 1; i <=10; i++){
            for(j = 0; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println(" ");
        }
    }
    
}
