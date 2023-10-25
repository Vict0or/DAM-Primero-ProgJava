import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // PRactica Sentencia de selección Switch
        //Entrada por teclado
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca dia de la semana que desea consultar:  ");
        numero = teclado.nextInt();
        //Sentencia aplicada a nueva sistema.Cerramos entrada.
        teclado.close();

        //Switch
        switch(numero){
            case 1: System.out.println("Usted ha elegido Lunes."); break;
            case 2: System.out.println("Usted ha elegido Martes."); break;
            case 3: System.out.println("Usted ha elegido Miercoles."); break;
            case 4: System.out.println("Usted ha elegido Jueves."); break;
            case 5: System.out.println("Usted ha elegido Viernes."); break;
            case 6: System.out.println("Usted ha elegido Sabado."); break;
            case 7: System.out.println("Usted ha elegido Domingo."); break;
            default: System.out.println("Error, dia introducido incorrecto."); break;

        }
    }

}
