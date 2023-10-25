import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*JUEGO: pediremos numeros al usuario, mostraremos si el numero es menor/mayor
        que el que buscamos. Cuando el usuario acierte, salimos del juego.
        */
        int num = 0;
        //boolean aux = true;
        int numCorrecto = 23;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();

            if(num > numCorrecto){
                System.out.println("El numero que has introducido es mayor que el que buscamos.");
            }else if(num < numCorrecto){
                System.out.println("El numero que has introducido es menor que el que buscamos.");
            }else{
                System.out.println("ACERTASTE!!");
            }
        }while(num != numCorrecto);
        sc.close();
    }
}
