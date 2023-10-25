import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /*Leer numeros hasta que se teclee un numero negativo. Mostrar cuantos numeros se han
        introducido.
        */
        int num = 0;
        boolean aux = true;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while(aux == true){
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();
            if(num > 0){
                contador++;
            }else{
                aux = false;
                contador++;
            }
        }
        System.out.println("El total de numeros introducidos es de: " + contador);
        sc.close();
    }
    
}
