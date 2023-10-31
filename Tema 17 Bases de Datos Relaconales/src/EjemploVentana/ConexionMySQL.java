package EjemploVentana;

import java.sql.*;
/**
 *
 * @author victor
 */
public class ConexionMySQL {
    
    private final String BD;
    protected String USUARIO;
    protected String PASS;
    //String para obtener las tablas de la base de datos en una consulta select
    protected String obtenertablas;
    protected Connection connection;
    protected String HOST;
    
    public ConexionMySQL(String usuario, String pass, String bd){
        HOST = "localhost";
        USUARIO = usuario;
        PASS = pass;
        BD = bd;
        connection = null;
        obtenertablas = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + BD + "'";
    }
    
    private void registrarDriver() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            throw  new SQLException("Error al conectar con MYSQL: " + e.getMessage());
        }
    }
    
    public void conectar() throws SQLException{
        if(connection == null || connection.isClosed()){
            registrarDriver();
            connection = (Connection)DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD, USUARIO, PASS);
        }
    }
    
    public String getDB(){
        return BD;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void cerrarBD()throws SQLException{
        if(connection != null && !connection.isClosed()){
            connection.close();
        }
    }
    
    public ResultSet ejecutarSelect (String consulta)throws SQLException{
        Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }
    
}
