import java.io.File;

public class ComprobacionDirectorios {
    public static void main(String[] args) {
        int count = 0;
        File directorio = new File("Practicas y Ejercicios/Tema 06 Operaciones con Ficheros/src/");
        File[] directorios = directorio.listFiles();    // Creamos una array para almacenar los archivos que haya.

        for(File d : directorios){
            if (d.isFile());        // Verificamos si son archivos en cada iteracion.
            count += 1;
            System.out.println(d);  
        }
        System.out.println("En la carperta SRC hay un total de: " + count + " archivos."); // La Salida debe ser de 7 archivos.
        System.out.println();
    }
}
