package Actividad;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Creamos objeto Alumn1
        Alumno alum1 = new Alumno("74885756X", "Victor", 36, 8, 6, 9);

        boolean isComprobacion = true;
        int aux = 0;

        alum1.mostrarMenu();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        while (isComprobacion) {
            System.out.println("Opcion: ");
            aux = sc.nextInt();

            switch (aux) {
                case 1: System.out.println("El nombre es: " + alum1.getNombre()); break;
                case 2:
                    String nuevoNombre = " ";
                    System.out.println("Cambio de Nombre, indiquelo:  ");
                    nuevoNombre = sc2.nextLine();
                    alum1.setNombre(nuevoNombre);
                    break;
                case 3: System.out.println("El DNI es: " + alum1.getDni()); break;
                case 4:
                    String nuevodni = " ";
                    System.out.println("Cambio de DNI, indiquelo:  ");
                    nuevodni = sc2.nextLine();
                    alum1.setDni(nuevodni);
                    break;
                case 5: System.out.println("La edad es: " + alum1.getEdad()); break;
                case 6: System.out.println("La nota media del alumno es: " + alum1.sacarMedia()); break;
                case 0:
                    System.out.println("**** EJECUCION DE SALIDA **** ");
                    isComprobacion = false;
                    break;
                default: System.out.println(" Error de introduccion de opción. Vuelva a intentarlo"); break;
            }
        }
        sc.close();
        sc2.close();
    }
}
