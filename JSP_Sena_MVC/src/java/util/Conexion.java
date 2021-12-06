/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC-Vargas
 */
public class Conexion {
    
    //1. variables de conexion
    String driver, bd, user, pass, urlBD;
    public Connection conexion;
    
    public Conexion(){
    
    driver ="com.mysql.jdbc.Driver";
    bd = "solumotors";
    user = "root";
    pass = "";
    urlBD = "jdbc:mysql://localhost:3306/" + bd;
    
    try{
    //CREAMOS INSTANCIA DEL DRIVER, CREANDO EL OBJETO
    Class.forName(driver).newInstance();
    
    conexion = DriverManager.getConnection(urlBD, user, pass);
    
    System.out.println("Conexion buenisima papu!");
    
    }catch(Exception e){
    
    System.out.println("Conexión por corregir" + e.toString());
    
    }
   
    }
    
    public Connection obtener_conexion(){
    
    return conexion;

    }
    
    public Connection cerrar_conexion() throws SQLException{
    
    //la cerramos
    conexion.close();
    //la vaciamos
    conexion=null;
    //la retornamos
    return conexion;
    
    }
    
    
    public static void main(String[] args) {
   
        new Conexion();
        
    }
    
 }
