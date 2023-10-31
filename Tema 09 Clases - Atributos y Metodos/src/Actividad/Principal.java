import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a necesitar
        int numero;
        char palo;
        
        Scanner sc = new Scanner(System.in);

        // Instanciamos objetos de la clase CARTA.
        Carta carta1 = new Carta();     // Carta que modificaremos con metodos GET/SET
        Carta carta2;
        
        // Metodos GET/SET
        carta1.setNumero(5);
        carta1.setPalo('T');

        // Inicializacion de Carta2 por parametros introducidos por usuario
        System.out.println ("Introduce el numero y el palo de una carta: ");
        numero = sc.nextInt();
        palo = sc.next().charAt(0);
        carta2 = new Carta(numero, palo);       // Instanciamos Carta2 con los valores del usuario.
        sc.close();

        // Mostramos ambas cartas
        carta1.mostrarCarta();
        carta2.mostrarCarta();

        // Comparamos cual es la mayor.
        System.out.println(carta1.compararCarta(carta2));
    }
}
