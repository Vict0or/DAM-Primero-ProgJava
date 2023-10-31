package SODA;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;
import com.db4o.query.Query;
/**
 * @author victor
 */
public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Connexion a la Base de datos:
        ObjectContainer bd = null;
        
        try{
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "alumnos.db4o");
            
            //Creamos los alumnos 
            Alumno a1 = new Alumno("Laura", 5, 7, 6);
            Alumno a2 = new Alumno("Victor", 8, 2, 7);
            Alumno a3 = new Alumno("Tania", 7, 7, 6);
            
            //Los añadimos a la base de datos 
            bd.store(a1);
            bd.store(a2);
            bd.store(a3);
            
            //Creamos el objeto de tipo Quary para la consulta y la enlazamos a la base de datos.
            Query consulta = bd.query();
            
            //Añadimos las restricciones a la consulta:
            consulta.constrain(Alumno.class);   // Indicamos sobre los objetos de qué CLASE haremos IMPORTATE.
            consulta.descend("nota1").constrain(5).greater().equal();
            consulta.descend("nombre").orderDescending();
            
            //Creamos objeto ObjectSet con su metodo execute para rescartar los datos:
            ObjectSet res = consulta.execute();
            
            //mostramos valores capturados en el objero RES
            while (res.hasNext()){
                System.out.println(res.next());
            }
            
        }catch (DatabaseClosedException | DatabaseFileLockedException | DatabaseReadOnlyException | Db4oIOException | IncompatibleFileFormatException | OldFormatException ex){
               System.out.println("Error: " + ex.toString());
            } finally {
               bd.close();
            }
    }
}
   
