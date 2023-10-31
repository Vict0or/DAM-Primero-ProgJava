package EjemploSelect;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        ConexionSql conx1 = new ConexionSql("root", "", "tema17");

        try {
            //sString consulta = "SELECT * FROM pruebas WHERE nombre = 'Juan'";
            String consulta = "SELECT * FROM pruebas";
            conx1.conectar();
            conx1.ejecutaSelect(consulta);
            conx1.imprimirConsulta(consulta);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }finally{
            conx1.cerrarConexion();
        }

    }
           
}
