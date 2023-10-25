import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /**Realizaremos el calculo de una ecuacion de segundo grado, donde mostraremos
         * su soluciones, si la tiene.
         */
        double a = 0, b = 0, c = 0; // declaramos variables de la ecuación ax^2+bx+c=0.
        double x1 = 0, x2 = 0; // declaramos solucion reales y determinante.

        Scanner sc = new Scanner(System.in); // entrada de teclado.
        
        System.out.println("Enter a coefficient -A- : ");
        a = sc.nextDouble();
        System.out.println("Enter a coefficient -B- : ");
        b = sc.nextDouble();
        System.out.println("Enter a coefficient -C- : ");
        c = sc.nextDouble();
	    sc.close();

        //Realizamos las comprobaciones para los posibles resultados.
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if(discriminant < 0){
            System.out.println("There are no real solutions.");
        }else {
            if (a == 0 || a < 0) {
                System.out.println("There are no real solutions.");
            }
            if (a > 0) {
                x1 = (-b + (Math.sqrt(discriminant))) / (2 * a);
                x2 = (-b - (Math.sqrt(discriminant))) / (2 * a);
                System.out.println("Solution 1: " + x1);
                System.out.println("Solution 2: " + x2);
            }
        }
    }
}
