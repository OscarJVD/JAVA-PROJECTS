
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-Vargas
 */
public class Conexion {
    
    public Connection conexion = null;
    
    public Connection conectar() throws ClassNotFoundException{
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    +"solumobil?useTimezone=true&serverTimezone=UTC","root","");           
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Algo salio mal :L"+" "+e.getMessage());
        }
        return conexion;
    }
}
