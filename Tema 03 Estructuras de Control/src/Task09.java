import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*Pedir el dia, mes y año de una fecha e indicar si es correcta. todos los meses tienen 30 dias.
        Condiciones a tener en cuenta:
        Dia: ente 0 y 30
        Mes: entre 0 y 12
        Año: por encima de 0.
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

        if(dia <= 30 && dia > 0){
            if(mes >= 1 && mes <= 12 && año > 0){
                System.out.println("Su fecha es correcta, " + dia + "/" + mes + "/" + año);
            }else{
                System.out.println("Fecha introducida incorrecta");
            }
        }else{
            System.out.println("Fecha introducida incorrecta");
        }
    }
}
