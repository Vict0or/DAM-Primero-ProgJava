package Actividad01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int dia;

        Scanner sc = new Scanner(System.in);
        // Instanciamos objeto con Constructor por DEFECTO
        Agenda agenda1 = new Agenda();
        agenda1.setLunes(" Poner Lavadora");
        agenda1.setMartes("Poner Lavavajillas");
        agenda1.setMiercoles("Planchar");
        agenda1.setJueves("Fregar Suelo");
        agenda1.setViernes("Descansar");

        // Mostramos dia seleccionado por usuario
        System.out.println("Introduzca el dia que quiera visualizar de AGENDA1: ");
        dia = sc.nextInt();
        agenda1.mostrarDia(dia);
        System.out.println(" ");
        sc.close();

        System.out.println("Todos los dias de Agenda1: ");
        for(int i = 0; i < 6; i++){
            agenda1.mostrarDia(i);      // Bucle para iterar sobre todos los atributos.
        }

        // Instanciamos segudna AGENDA (Contructor por P)
        Agenda agenda2 = new Agenda("Conducir", "Trabajar", "Recojer Niños", "Llevar niños", "Hacer Compra");

        System.out.println(" ");
        System.out.println("Todos los dias de Agenda2: ");
        
        for(int i = 0; i < 6; i++){     // Mostramos todos los dias de la segunda Agenda
            agenda2.mostrarDia(i);
        }
        System.out.println(" ");
        System.out.println(agenda1);       // Metodo ToString
    }
}
