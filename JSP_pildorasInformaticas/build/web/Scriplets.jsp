<%-- 
    Document   : Scriplets
    Created on : 28/04/2020, 08:24:20 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Scriplet</title>
    </head>
    <body>
        <h1>Ejemplo Scriplet</h1>
        <div>
            
            <%
             for(int i=0; i< 10; i++)
            {
            
                out.println("<p>Este es el mensaje numero: " + i + "</p>");
            
            } 
            %>


        </div>

    </body>
</html>
