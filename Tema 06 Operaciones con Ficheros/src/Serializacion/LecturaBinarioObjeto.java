package Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaBinarioObjeto {
    public static void main(String[] args) {
        // Creamos los objetos de las clases que vamos a necesitar
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona p;

        // Bloque TRY-CATCH
        try {
            fis = new FileInputStream("Practicas y Ejercicios/Tema 06 Operaciones con Ficheros/src/Serializacion/personas.dat");
            entrada = new ObjectInputStream(fis);

            // Para mostrar los objetos del fichero
            p = (Persona) entrada.readObject();     // Es necesario hacer el Casting
            System.out.println(p.toString());

            p = (Persona) entrada.readObject();     // Es necesario hacer el Casting
            System.out.println(p.toString());

            p = (Persona) entrada.readObject();     // Es necesario hacer el Casting
            System.out.println(p.toString());

        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Error 1: " + e.toString());
        }finally{
            try {
                entrada.close();
                fis.close();
            } catch (Exception e) {
                System.out.println("Error 2: " + e.toString());
            }
        }
    }
}
