<%-- 
    Document   : VistaJSP
    Created on : 2/05/2020, 07:27:28 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--DIRECTIVA JSP-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>VER VIDEOS DE JSP :O</h1>
        
        <c:forEach var="tempProductos" items="${lista_servicios}">
            
            ${tempProductos}<p></p>
            
        </c:forEach>    
    </body>
</html>
