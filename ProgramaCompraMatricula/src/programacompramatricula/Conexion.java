
package programacompramatricula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion(){
        String UrlConexion = "jdbc:sqlserver://localhost:1433;"
                           + "database=umss_db;"
                           + "user=Admin;"
                           + "password=Admin123;"
                           + "loginTimeout=20";
        
        try{
            Connection con = DriverManager.getConnection(UrlConexion);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        
        }
    }
}
