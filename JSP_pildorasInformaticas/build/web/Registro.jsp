<%-- 
    Document   : Registro
    Created on : 29/04/2020, 10:43:44 AM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title>Mostrar datos de registros</title>
    </head>
    <body>
        <h1>Mostrar datos de registros</h1>
        <label>Usuario confirmado:</label>
        <p></p><p></p>
        <label>Nombre: </label> <%= request.getParameter("nombre") %>
        <p></p>
        <label>Apellido: </label> <%= request.getParameter("apellido") %>
        <p></p>
        <jsp:include page="fecha.jsp"></jsp:include>
    </body>
</html>
