/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    private static String bd = "loginjava19";
    private static String user = "root";
    private static String pass = "belen2018";
    private static String ruta = "jdbc:mysql://localhost:3306/"+bd+"?useSSL=false"; 
    private Connection cnx = null;

    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void Conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cnx = DriverManager.getConnection(ruta, user, pass);
            if(this.cnx != null){
                System.out.println("Conectado Ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar :" + e.getMessage());
        }
    }
    public void Desconectar() throws Exception{
        try {
            if(this.cnx != null){
                if(this.cnx.isClosed() != true){
                    this.cnx.close();
                }
            }
        } catch (Exception e) {
        }
    }
}
