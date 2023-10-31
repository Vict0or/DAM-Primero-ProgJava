package QB4;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos la conexion con la base de datos
        ObjectContainer bd = null;
        try {
            // Creamos la conexion con la base de datos
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bdalumnos");
            
            //Creamos un objeto de Ejemplo para realizar las consultas
            Alumno ejemplo1 = new Alumno(null, null, 0);
            ObjectSet ret1 = bd.queryByExample(ejemplo1);

            /**  Creamos 3 alumnos instanciando los contructores. Usar unicamente para la inserccion.
            Alumno alu1 = new Alumno("Rodriguez", "Victor", 0);
            Alumno alu2 = new Alumno("Banegas", "Jesus", 14);
            Alumno alu3 = new Alumno("Banegas", "Dulce", 12);
            // Los añadimos a la BD
            bd.store(alu1);
            bd.store(alu2);
            bd.store(alu3);
            */
            // Bucle para visualizar los datos que ya hemos insertado
            while(ret1.hasNext()){
                //Obtengo el siguiente y lo saco por pantalla
                System.out.println(ret1.next());
            }
            

          
        } catch (DatabaseClosedException | DatabaseFileLockedException | DatabaseReadOnlyException | Db4oIOException | IncompatibleFileFormatException | OldFormatException ex) {
            System.out.println("Error: " + ex.toString());
        } finally {
           bd.close();
        }
    }
}
