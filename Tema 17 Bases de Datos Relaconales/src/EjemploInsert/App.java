package EjemploInsert;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        ConexionSql conx2 = new ConexionSql("root", "", "tema04");
        try{
            String sentenciaInsert = "INSERT INTO pruebas(DNI, Nombre, Apellidos, Telefono, Email) VALUES ('96541232A', 'Yisus', 'Banegas Aguilera', 456325412, 'yisus@gmail.com')";
            conx2.conectar();
            conx2.sentenciaInsert(sentenciaInsert);
        }catch (SQLException ex){
            System.out.println("Error: " + ex.toString());
        }finally {
            conx2.cerrarConexion();
        }
    }
    
    
}
