import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Practica03 {
     public static void main(String[] args) {
        // Texto de las opciones para responder
        Object[] opciones = {"SI", "NO"};
        int respuesta = JOptionPane.showOptionDialog(null, "Desea Guardar los cambios", "Pregunta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        System.out.println("Has respondido: " + respuesta);
     }   
}
