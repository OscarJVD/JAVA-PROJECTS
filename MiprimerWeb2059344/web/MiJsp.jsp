<%-- 
    Document   : MiJsp
    Created on : 29/04/2020, 03:22:08 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi JSP</title>
    </head>
    <body>
        <h1>Mi primer JSP</h1>
        
        <%!  // DECLARACIONES GLOBAL
        int numero1;
        %>
        
        <h3>Aqui va un texto</h3>
        
        <%  // JAVA EN GENERAL
        int numero2 = 7;
       
        numero1=7;
        
        String mensaje = "Bienvenido buenas tardes señor Oscar Vargas";
        
        if (numero1 == numero2) {
            
            out.println("Son iguales");
            out.println(mensaje);
            
            
         }else{
        
        mensaje = "Son diferentes no tiene acceso, permiso concedido para disparar al intruso";
            
        }
  
        %>
        
        
        <h4>Mensaje: <%= mensaje %></h4>
        
    </body>
</html>
