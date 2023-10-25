import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /* Pediremos al usuario una nota del 0 al 10; mostraremos Insuficiente, Suficiente, Bien...
         */
        int nota = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nota: ");
        nota = sc.nextInt();
        sc.close();

        switch(nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Su nota es: INSUFICIENTE.");
                break;
            case 5:
                System.out.println("Su nota es: SUFICIENTE.");
                break;
            case 6:
                System.out.println("Su nota es: BIEN.");
                break;
            case 7:
            case 8:
                System.out.println("Su nota es: NOTABLE.");
                break;
            case 9:
                System.out.println("Su nota es: NOTABLE ALTO.");
                break;
            case 10:
                System.out.println("Su nota es: SOBRESALIENTE.");
                break;
            default:
                System.out.println("La nota introducida no es correcta.");
                break;
        }
    }
    
}
