/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC-Vargas
 */
public class PruebaPoolConexiones {
    
    public static void main(String[] args) {
   
    try{
     
    Connection c= PoolConexiones.getInstance().getConnection();
    
    if (c!=null) {
        
        System.out.println("YEAH CONECTADO PAPA!");
        PoolConexiones.getInstance().closeConnection(c);
   
    }else{
    
        System.out.println(":l Revisa Colega!");
    
    }
    
    }catch(SQLException e){
    
    System.out.println(e.getMessage());
    
    }
    
    
    
     }
}
