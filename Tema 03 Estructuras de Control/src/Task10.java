import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*Pedir el dia, mes y año e indicar si la fecha es correcta, con meses de 28, 30 y 31 dias.
         */

        int dia = 0, mes = 0, año = 0;
        boolean aux = true;     //Incluimos una variable auxiliar para establer comprobacion.
        int dias_del_mes = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduzca el año: ");
        año = sc.nextInt();
        sc.close();

        //Comprobaciones de los valores que se introducen con los topes por dia, mes y año.
        if(año == 0)
            aux = false;
        if(dia < 1 && dia > 31)
            aux = false;
        if(mes < 1 && mes > 12)
            aux = false;

        //Ahora asignamos los dias 28, 30 y 31 en funcion del nº de mes.
        if(mes == 2)
            dias_del_mes = 28;
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;
        if(mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            dias_del_mes = 31;
        if(dia > dias_del_mes)
            aux = false;
        /*Con estas comprobaciones evitamos que se introduzcan dias equivocados en segun que meses.
        Ejemplo: 28 dias para el Mes 12.
        */

        if(aux)
            System.out.println("Fecha introducida CORRECTA, " + dia + "/" + mes + "/" + año);
        else
            System.out.println("Fecha introducida INCORRECTA");
    }
    
}
