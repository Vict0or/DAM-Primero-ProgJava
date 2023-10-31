package Actividad01;

public class App {
    public static void main(String[] args) throws Exception{
        // Instanciamos el objeto
        CuentaCorriente miCuenta = new CuentaCorriente(2500);
        
        System.out.println(miCuenta.getSaldo());
        miCuenta.ingresaDinero(-3000);
        System.out.println("Info: " + miCuenta.toString());


    }
}
