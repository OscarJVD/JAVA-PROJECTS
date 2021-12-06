/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;
import util.PoolConexiones;
import util.PruebaPoolConexiones;

/**
 *
 * @author PC-Vargas
 */
public class Servlet_Pruebas_Pool extends HttpServlet {
    
    
    //1. DECLARAR CONSTANTE demrd
    private static final long serialVersionUID = 1L;

    //2. DEFINIR O ESTABLECER EL DATA SOURCE RECURSO DE INFORMACION
    //(SIN PUNTO Y COMA AL FINAL) e importar el pack de anotaciones
    //TRAE LA INFORMACION DE CONEXION DEL POOL
    @Resource(name="jdbc/servicio")
    
    //3. CREAMOS VARIABLE DE TIPO RECURSO DE INFORMACION DataSource e importar paquete .sql....
    private DataSource miPool;
    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_Pruebas_Pool</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_Pruebas_Pool at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //4. CREAMOS EL OBJETO DE TIPO PrintWriter para especificar el 
        //tipo de archivo que va a crear este Servlet para dar respuesta a la vista
        PrintWriter salida=response.getWriter();
        
        response.setContentType("text/plain");
        
        //5. CREAR CONEXION CON LA BD eIMPORTAR PAQUETES 
        //.SQL MENOS EL STATEMENT QUE LLEVA .JDBC....
        Connection miConexion=null;
        
        Statement miStatement=null;
        
        ResultSet miResultSet=null;
        
        //6. UTILIZAR POOL PARA CONEXION
        
        try{
        
            miConexion=miPool.getConnection();
            
            //7. CONSULTA
            String consulta="SELECT * FROM servicio";
            
            //8. DECLARACION O SENTENCIACION DE LA CONEXION
            miStatement=miConexion.createStatement();
            
            //9. EJECUTA CONSULTA
            miResultSet=miStatement.executeQuery(consulta);
            
            //10. MIENTRAS HALLAN REGISTROS - EJECUTAR 
            //CONSULTA DE SELECCION DE REGISTROS
            while(miResultSet.next()){
            
                String servicios=miResultSet.getString(7);
                
                salida.println(servicios);
            
            }
            
            
        }
        catch(Exception e){
        
            e.printStackTrace();
        
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
