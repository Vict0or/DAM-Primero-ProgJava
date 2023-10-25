import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /*Leer un numero e indicar si es positivo o negativo. El proceso terminará
        cuando introduzcamos un 0.
        */
        int num = 0;
        boolean aux = true;

        while(aux == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();
            sc.close();
            if(num < 0){
                System.out.println("El numero introducido es Negativo");
            }else if(num > 0){
                System.out.println("El numero introducido es Positivo");
            }else{
                System.out.println("Digito de salida introducido, ADIOS!!");
                break;
                //aux = false;
            }
        }
    }
    
}
