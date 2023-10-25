import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        /*Leer numeros hasta que se teclee 0. Mostrar la suma de todos los numeros introducidos.
         */
        int num = 0;
        boolean aux = true;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while(aux == true){
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();
            //sc.close();
            if(num > 0){
                contador += num;
            }else{
                aux = false;
            }
        }
        System.out.println("La suma total de los numeros introducidos es de: " + contador);
        sc.close();
    }
    
}
