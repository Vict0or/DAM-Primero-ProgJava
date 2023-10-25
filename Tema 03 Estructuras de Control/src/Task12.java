import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*Pediremos al usuario que introduzca 2 fechas, indicaremos cuántos dias hay
        entre una y otra.
        */
        String fecha1;
        String fecha2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera fecha - formato YYYY-MM-DD: ");
        fecha1 = sc.nextLine();
        System.out.println("Introduzca la segunda fecha - formato YYYY-MM-DD: ");
        fecha2 = sc.nextLine();
        sc.close();

        //Creamos dos objetos de tipo LocalDate
        LocalDate primeraFecha = LocalDate.parse(fecha1);   //Parseamos el String fecha uno al tipo de Objeto
        LocalDate segundaFecha = LocalDate.parse(fecha2);

        long diff = ChronoUnit.DAYS.between(primeraFecha, segundaFecha);    //Funcion donde calcularemos la diferencia

        System.out.println("La diferencia entre ambas fechas es de: " + diff + " dias.");


    }
}
