
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC-Vargas
 */
public class conexion {
    
    public static void main(String[] args) {
        
        new conexion(); 
   
}
    
    public String driver, user, pass, bd, urlBD;
    
    public Connection conexion;

    public conexion() {
        driver = "com.mysql.jdbc.Driver";
        user = "root";
        pass = "";
        bd = "venta_carros_sena";
        urlBD = "jdbc:mysql://localhost:3306/" + bd;
        
        //instanciar el driver
        try {
            
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBD, user, pass);
            System.out.println("Conexion OK!");
            
            } catch (Exception e) {
                
                System.out.println("Conexión fallida" + e.toString());
                
            }
    }
    
    public Connection obtener_Conexion(){
    
    return conexion;
    
    }

    public Connection cerrar_Conexion() throws SQLException{    
        
        conexion.close();
        conexion = null;
        return conexion;
        
    }
    
    
   
    
    
    
}
