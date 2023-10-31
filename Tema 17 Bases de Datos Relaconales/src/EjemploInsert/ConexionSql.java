package EjemploInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.TimeZone;

public class ConexionSql {
    // Constantes para los datos de acceso a la BD
    private Connection connection;
    private String BD;
    private String USUARIO;
    private String PASS;
    private String HOST;
    
     // Constructor de la clase
    public ConexionSql(String usuario, String pass, String bd){
        HOST = "localhost";
        this.USUARIO = usuario;
        this.PASS = pass;
        this.BD = "tema17";
        this.connection = null;
    }

    /**
     * Metodo de comprobacion, comprueba que el driver de MySQL esté correctamente integrado
     * @throws SQLException Se lanzará cuando haya un fallo con la conexion del driver
     */
    private void registrarDriver() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al conectar con MYSQL: " + e.getMessage());
        }
    }

    /**
     * Metodo de conexion, 
     * @throws SQLException Se lanzará cuando haya un fallo con la base de datos
     */
    public void conectar() throws SQLException{
        if(connection == null || connection.isClosed()){
            registrarDriver();
            // Obtenemos la zona horaria
            Calendar now = Calendar.getInstance();
            TimeZone zonahoraria = now.getTimeZone();
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user="
                   + USUARIO + "&password=" + PASS + "&useLegacyDatetimeCode=false&serverTimezone="
                   + zonahoraria.getID());
            System.out.println("");
            System.out.println("Conexion realizada con exito!!" );
            System.out.println("");
        }
    }

    /**
     * Cierra la conexión con la base de datos
     * @throws SQLException Se lanzará cuando haya un fallo con la base de datos
     */
    public void cerrarConexion() throws SQLException{
        if(connection != null || !connection.isClosed()){
            connection.close();
        }
    }

    /**
     * Ejecuta una consulta SELECT
     * @param consulta Consulta SELECT a ejecutar
     * @return Resultado de la consulta
     * @throws SQLException Se lanzará cuando haya un fallo con la base de datos
     */

     public ResultSet ejecutaSelect(String consulta) throws SQLException{
        java.sql.Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        
        return rset;
     }
     
     public void sentenciaInsert(String sentenciaInsert) throws SQLException{
        Statement stmt = connection.createStatement();
        int filasAfectadas = stmt.executeUpdate(sentenciaInsert);//Usaremos el metodo .executeUpdate tambien para
        System.out.println("Ha sido afectada " + filasAfectadas + " Filass");                      //una sentencia DELETE
        // Numero de filas afectadas
    }
}