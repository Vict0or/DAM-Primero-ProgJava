package Actividad02;

import java.util.ArrayList;
import java.util.Scanner;

public class Alquiler implements Facturacion {
    //Declaramos un conjunto ArrayListo de Vehiculos.
    ArrayList<Vehiculo> pedido;

    //Constructor por Parametros e incializamos datos
    public Alquiler(int nVehiculos) {
        char tipo;
        String matricula;
        int dias, plazas;

        pedido = new ArrayList<Vehiculo>();

        Scanner sc = new Scanner((System.in));

        //Introduccion de datos
        for (int i = 0; i < nVehiculos; i++) {
            System.out.println("Introduce el tipo de Vehiculo: ");
            tipo = sc.next().charAt(0);

            //Limpiamos el buffer
            sc.nextLine();

            System.out.println("Introduce la matricula del vehiculo: ");
            matricula = sc.nextLine();

            System.out.println("Introduce los dias de Alquiler: ");
            dias = sc.nextInt();

            System.out.println("Introduce las plazas: ");
            plazas = sc.nextInt();

            sc.close();

            //Filtramos el tipo de Vehiculo
            if (tipo == 'C') {
                Coche c = new Coche(matricula, dias, plazas);
                pedido.add(c);
            } else {
                Bus b = new Bus(matricula, dias, plazas);
                pedido.add(b);
            }
        }
    }

    public double getImporteVehiculo(int pos) {
        double importe;
        importe = pedido.get(pos).importeAlquiler();

        return importe;
    }

    public double getImporteTotal() {
        double total = 0;
        for (int i = 0; i < pedido.size(); i++) {
            total += getImporteVehiculo(i);
        }
        return total;
    }

    @Override
    public void mostrarFacturacion() {
        System.out.println("Total alquiler: " + getImporteTotal() + "€ \n" +
                "------------------------------------\n" +
                "DETALLE\n" +
                "------------------------------------");
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println("VEHICULO " + i + "\n");
            pedido.get(i).mostrarRecibo();
        }
    }
}
