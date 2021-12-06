<%-- 
    Document   : ejemploObjetos
    Created on : 29/04/2020, 10:30:45 AM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Objetos predefinidos JSP</title>
    </head>
    <body>
        <h1>Objetos predefinidos JSP</h1>
        <div>Peticion datos del navegador: <%= request.getHeader("User-Agent") %></div>
        <div><p>Petición datos del idioma que se utiliza: <%= request.getLocale() %></p></div>

    </body>
</html>
