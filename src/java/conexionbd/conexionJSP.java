//clase conexion a base de datos MySql
package conexionbd;
//librerias
import java.sql.*;//general de BD

public class conexionJSP {//Inicia clase
    //Objetos de conexion a la base de datos
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
      //constructor
    public conexionJSP (String urlBD, String usuarioBD, String passwordBD) throws Exception {
        Class.forName ("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection (urlBD, usuarioBD, passwordBD);
        stmt = con.createStatement();
      }//Termina constructor
    //Metodo para consultas SELECT
    public ResultSet ejecutaSelect(String query) throws SQLException {
        rs = stmt.executeQuery(query);
        return rs;
    }//Termina metodo consulta
    
    //Metodo para actualizar
    public int ejecutaSentencia(String sql) throws SQLException {
        int cambios = stmt.executeUpdate(sql);
        return cambios;
    }//Termina metodo modificar
    
}// Termina clase
