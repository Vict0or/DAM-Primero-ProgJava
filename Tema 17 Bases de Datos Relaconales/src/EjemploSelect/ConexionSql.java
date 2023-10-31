package EjemploSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    /**
     * Ejecuta una consulta SELECT
     * @param consulta Consulta SELECT a ejecutar
     * @return Resultado de la consulta
     * @throws SQLException Se lanzará cuando haya un fallo con la base de datos
     */
   
    public void imprimirConsulta(String consulta) throws SQLException {
        ResultSet aux = ejecutaSelect(consulta);
            while(aux.next()){
                String dni = aux.getString("DNI");
                String nombre = aux.getNString("Nombre");
                String apellidos = aux.getNString("Apellidos");
                Integer telefono = aux.getInt("Telefono");
                String mail = aux.getNString("Email");

                System.out.println(dni + " || " + nombre + " || " + apellidos + " || " + telefono + " || " + mail);
            }
            System.out.println("");
    }
}
