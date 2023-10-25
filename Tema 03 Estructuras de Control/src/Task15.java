import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /*Leer numeros hasta que introduzcamos 0. Para cada uno indicar si es par o impar.
         */
        int num = 0;
        boolean aux = true;

        while(aux == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();
            sc.close();
            if(num % 2 == 0 && num > 0){
                System.out.println("El numero introducido es PAR");
            }else if(num % 2 != 0 && num > 0){
                System.out.println("El numero introducido es IMPAR");
            }else{
                System.out.println("Digito de salida introducido, ADIOS!!");
                break;
                //aux = false;
            }
        }
    }
    
}
