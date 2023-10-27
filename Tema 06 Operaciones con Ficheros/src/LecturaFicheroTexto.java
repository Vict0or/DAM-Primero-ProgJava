import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheroTexto {
    public static void main(String[] args) {
        // Creamos objetos de las clases que vamos a usar; FILE, FILEREADER, BUFFEREDREADER
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer la lectura disponible con el metodo readline()
            archivo = new File("Practicas y Ejercicios/Tema 06 Operaciones con Ficheros/src/prueba2.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del archivo
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);          // Mientras readline caputure datos, leerá. 
            }                                       // Cuando sea valor nulo, que no tiene nada, fin de bucle.
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero " + e.toString());
        }finally{
            try {
                br.close();
                fr.close();     // Solo cerraremos los flujos (xReader)
            } catch (Exception e2) {
                System.out.println("Error leyendo el fichero " + e2.toString());
            }
        }
    }
}
