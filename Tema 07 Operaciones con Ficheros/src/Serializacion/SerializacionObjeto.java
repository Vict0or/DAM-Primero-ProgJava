package Serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializacionObjeto {
    public static void main(String[] args) {
        // Creamos los flujos necesarios para la escritura del objeto
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;

        try {
            // Creamos el fichero donde vamos a escribir el objeto
            fos = new FileOutputStream("personas.dat");
            salida = new ObjectOutputStream(fos);

            // Creamos el objeto con los parametros y lo serializamos en el fichero
            p = new Persona("12345687", "Lucas", 30);
            salida.writeObject(p);

            p = new Persona("98765432", "Miguel", 40);
            salida.writeObject(p);

            p = new Persona("123987456", "EsMismo", 35);
            salida.writeObject(p);

        } catch (Exception e) {
            System.out.println("Error 1: " + e.toString());
        }finally{
            try {
                salida.close();
                fos.close();
            } catch (Exception e) {
                System.out.println("Error 2: " + e.toString());
            }
        }
    }
}
