<%-- 
    Document   : validar_Usuario
    Created on : 1/05/2020, 02:41:53 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validar</title>
    </head>
    <body>
        
        
        
        <!--IMPORTAR PAQUETES DE JAVA-->
        <%@page import="java.sql.*" %>
        
        <%
        
        
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("contra");
        
        // CARGAR UBICACION DEL DRIVER DE CONEXION
        Class.forName("com.mysql.jdbc.Driver");
        
        //ATRAPAR ERRORES Y EXCEPCIONES
        try{
        Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/solumobil","root","");
       
        //EVITAR INYECCION SQL
        PreparedStatement c_preparada=miConexion.prepareStatement("SELECT * FROM Registro WHERE correo_electronico=? AND contraseña=?");
        
        //INDICAR QUE SE INTENTA ALMACENAR EN LA CONSULTA PREPARADA ?
        c_preparada.setString(1, usuario);
        c_preparada.setString(2, contra);
        
        //EJECUTAR CONSULTA Y ALMACENARLA EN EL RECORDSET o resultset
        ResultSet miResultset=c_preparada.executeQuery();
        
        //VERIFICAR SI HAY AQUEL USUARIO CONE ESOS DATOS
        if (miResultset.absolute(1)) out.println("Usuario autorizado");
        
        else out.println("No hay usuarios con esos datos");
        
        }catch(Exception e){
        
        out.println("Ha ocurrido un error");
        
        }
        %>
    </body>
</html>
