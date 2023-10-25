import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*Pedir el dia, mes y año de una fecha e indicar si es correcta. todos los meses tienen 30 dias.
        Condiciones a tener en cuenta:
        Dia: ente 0 y 30
        Mes: entre 0 y 12
        Año: por encima de 0.
        Si se cumple todo esto, mostraremos la fecha del dia siguiente.
        */
        int dia = 0, mes = 0, año = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduzca el año: ");
        año = sc.nextInt();
        sc.close();

        /*Con la siguiente comprobacion vamos a comprobar el ultimo dia del mes, que
        ya pasariamos a un mes nuevo. Si ademas es el mes 12, iriamos a un año nuevo.
        */
        if(dia == 30){
            dia = 1;
            mes ++;
            if(mes >= 12){
                mes = 1;
                año ++;
            }
        }
        if(dia <= 30 && dia >= 1){
            if(mes >= 1 && mes <= 12 && año > 0){
                System.out.println("Su fecha es correcta y la fecha del dia siguiente es: "+ dia + "/" + mes + "/" + año);
            }else{
                System.out.println("Fecha introducida incorrecta");
            }
        }else{
            System.out.println("Fecha introducida incorrecta");
        }
    }
    
}
