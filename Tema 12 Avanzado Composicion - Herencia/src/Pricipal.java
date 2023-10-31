import java.util.Scanner;

public class Pricipal {
    public static String descuento;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String cliente, descripcion;
        double importe;
        Factura factura;

        System.out.println("Introduzca el nombre del cliente; ");
        cliente = sc.nextLine();
        System.out.println("Introduzca los articulos presupuestados; ");
        descripcion = sc.nextLine();
        System.out.println("Introduzca el importe; ");
        importe = sc.nextDouble();
        sc.close();

        factura = new Factura(cliente, descripcion, importe);
        factura.imprimirPresupuesto();
    }
}
