/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC-Vargas
 */
public class Usuario_registroDAO {
    
    //1. Declarar elementos para conexión
    private Connection conexion=null;
    //2. El puente Bifrost
    private PreparedStatement puente=null;
    //3. El mensajero
    private ResultSet mensajero=null;
    
    public boolean operación=false;
    
    public String usuId="", usuLogin="", usuPassword="";
}
