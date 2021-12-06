<%-- 
    Document   : recoge_Datos
    Created on : 30/04/2020, 12:32:44 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recoge datos</title>
    </head>
    <body>
        <h1>Recoge datos</h1>
        
        <!--IMPORTAR PAQUETES DE JAVA-->
        <%@page import="java.sql.*" %>
        
        <%
        
        
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("contra");
        String pais = request.getParameter("pais");
        String tecnologias = request.getParameter("tecnologias");
        
        // CARGAR UBICACION DEL DRIVER DE CONEXION
        Class.forName("com.mysql.jdbc.Driver");
        
        //ATRAPAR ERRORES Y EXCEPCIONES
        try{
        Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_proyecto_pi","root","");
       
        Statement miStatement = miConexion.createStatement();
        //LLEVAR LOS DATOS A LA BD
        String instruccionsql="INSERT INTO USUARIO (nombre, apellido , usuario, contrasena, pais, tecnologia) VALUES('" + nombre + "','"+ apellido + "','"+ usuario + "','" + contra + "','"+ pais + "','" + tecnologias + "')";
        //HACER CONSULTA DE ACTUALIZACION
        miStatement.executeUpdate(instruccionsql);
        
        out.println("¡Registrado con exito! :D");
        
        }catch(Exception e){
        
        out.println("Ha ocurrido un error");
        
        }
        %>
    </body>
</html>
