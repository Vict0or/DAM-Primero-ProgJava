import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraFicheroTexto {
    public static void main(String[] args) {
        // Vamos a crear los obejtos necesarios de cada clase: FILEWRITER Y PRINTWRITER
        FileWriter fichero = null;
        PrintWriter pw = null;

        // Creamos bloque TRY para controlar excepciones e inicializamos 
        // cada objeto
        try {
            fichero = new FileWriter("prueba2.txt", true); //Damos nombre al fichero
            pw = new PrintWriter(fichero);

            // Escribimos lo que necesitemos en el fichero. Si este no existe se creara por defecto
            pw.println("Esto es un mensaje para quiene lo lea!!");
            // Tambien podemos usar un bucle parahacer operaciones de escritura. EJ:
            for(int i = 0; i < 10 ; i++ ){
                pw.println("Linea " + i);   // Escribiremos 10 lineas con su numeracion.
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero " + e.toString());
        }finally{ 
            try{
            // Bloque obligatorio para cerrar ambos flujos.
            // Debe cerrarse en orden contrario a como fueron declarados.
            pw.close();
            fichero.close();
            }catch(IOException e2){
                System.out.println("Error escribiendo el fichero " + e2.toString());
            }
        }
    }
}
