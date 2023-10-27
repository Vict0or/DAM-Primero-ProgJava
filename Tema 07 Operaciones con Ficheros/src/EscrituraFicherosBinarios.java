import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class EscrituraFicherosBinarios {
    public static void main(String[] args) {
        // ESCRITURA EN FICHEROS BINARIOS
        // Establecemos los objetos de las clases que necesitamos:
        FileOutputStream fileOutput = null;
        BufferedOutputStream bufferedOutput = null;
        String saltoLinea = "\n";       //Tenemos que insertar el salto de linea manualmente.

        try {
            //Creamos el fichero binario para escribir
            fileOutput = new FileOutputStream("fichero_binario.dat");
            bufferedOutput = new BufferedOutputStream(fileOutput);

            // Escribimos en el fichero
            for(int i = 0; i < 10; i++){
                String escribir = ("Linea " + i);
                bufferedOutput.write(escribir.getBytes(StandardCharsets.UTF_8));    // IMPORTANTE establecer la Codigicacion UTF-8
                bufferedOutput.write(saltoLinea.getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            System.out.println("Error escribiendo en el fichero: " + e.toString());
        }finally{
            try {
                bufferedOutput.close();
                fileOutput.close();
            } catch (Exception e2) {
                System.out.println("Error escribiendo en el fichero: " + e2.toString());
            }
        }
    }
}
