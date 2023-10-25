import javax.swing.*;

public class Practica05 {
    public static void main(String[] args) {
        /* Realizar un Array el cual iremos rellenando a traves de un dialogo de ventana.
        Usar bucle For Each.
        */
        String[] paises = new String[8];

        //Bucle para ir rellenando el Array con el cuadro de dialogo.
        for (int i = 0; i < 8; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce Pais: ");
        }
        //Mostramos por pantalla el resultado. Bucle For Each.
        for (String elemento:paises) {
            System.out.println(elemento);
        }
    }
}
