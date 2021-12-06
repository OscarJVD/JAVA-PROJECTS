/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author PC-Vargas
 */
public class PoolConexiones {
    
    private final String DB ="solumobil";
    private final String URL ="jdbc:mysql://localhost:3306/" + DB + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USER ="root";
    private final String PASSWORD ="";
    
    private static PoolConexiones dataSource;
    private BasicDataSource basicDataSource=null;
    
    
    private PoolConexiones(){
    
    basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
    basicDataSource.setUsername(USER);
    basicDataSource.setPassword(PASSWORD);
    basicDataSource.setUrl(URL);
    
    //OPCIONALES YA QUE EL SISTEMA LO HACE DE POR SI
    basicDataSource.setMinIdle(5);
    basicDataSource.setMaxIdle(20);
    basicDataSource.setMaxTotal(50);
    basicDataSource.setMaxWaitMillis(10000);
    
    
    }
    
    
    //VERIFICAR QUE SOLO HAYA UNA INSTANCIA DE DICHO OBJETO
    public static PoolConexiones getInstance(){
    
    if (dataSource==null) {
   
        dataSource=new PoolConexiones();
        
        return dataSource;
        
    }else{
    
        return dataSource;
    }
  
     }
    
    
    /*//FORMA GORDA :L
    public Connection getConnection(){
    
    Connection connect=null;
    
    try{
    
        connect=this.basicDataSource.getConnection();
        System.out.println("CONEXION EXCELENTE!");
    
    }catch(SQLException e){
    
        System.out.println(e.getMessage());
        System.out.println(":l");
    }
    return connect;
    
    
     }*/
    
    //AHORRO DE CODIGO
    public Connection getConnection() throws SQLException{
    
       return this.basicDataSource.getConnection();
        
    
     }
    
    
    
    
    
   public void  closeConnection(Connection connection) throws SQLException{
   
       connection.close();
   
   }
        
}
