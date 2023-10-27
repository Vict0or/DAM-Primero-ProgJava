import java.io.*;
import java.nio.charset.StandardCharsets;

public class LecturaFicheroBinario {
    public static void main(String[] args) {
        // Clases de LECTURA DE UN FICHERO BINARIO
        FileInputStream fichero_binario = null;
        BufferedInputStream buffer_binario_lectura = null;
        BufferedReader buffer_lectura = null;
        String linea = "";

        try{
            // Se abre el fichero binario para lectura
            fichero_binario = new FileInputStream("Practicas y Ejercicios/Tema 06 Operaciones con Ficheros/src/fichero_binario.dat ");
            buffer_binario_lectura = new BufferedInputStream(fichero_binario);
            buffer_lectura = new BufferedReader(new InputStreamReader(buffer_binario_lectura, StandardCharsets.UTF_8));

            // Bucle para leer línea a línea del fichero
            while ((linea = buffer_lectura.readLine()) != null)
            {
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Error leyendo el fichero: " + e.toString());
        } finally{
            try{
                buffer_binario_lectura.close();
                fichero_binario.close();
            }catch (IOException e2){
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
    }
}
