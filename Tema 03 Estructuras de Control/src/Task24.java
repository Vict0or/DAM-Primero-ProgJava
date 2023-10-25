import java.util.Scanner;
public class Task24 {
    public static void main(String[] args) {
        //Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€

        int num = 0, contador = 0, sueldoTotal = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Introduzca el sueldo " + i + ": ");
            num = sc.nextInt();
            sueldoTotal += num;
            if(num > 1000) contador++;
        }
        sc.close();
        System.out.println("La suma de los 10 sueldos es: " + sueldoTotal + "€, y hay " +
                contador + " sueldos por encima de 1000€");
    }
    
}
