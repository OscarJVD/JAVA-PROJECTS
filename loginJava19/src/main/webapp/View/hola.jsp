<%-- 
    Document   : hola
    Created on : 12-20-2019, 11:36:23 AM
    Author     : jose.hernandezusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page session="true" %>
<%
HttpSession sesion_actual = request.getSession(true);
String nombre = (String)sesion_actual.getAttribute("NOMBRE");
String apellido = (String)sesion_actual.getAttribute("APELLIDO");
String rol = (String) sesion_actual.getAttribute("ROL");

if(nombre == null && apellido == null && rol == null){
    response.sendRedirect("index.jsp");
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World JAVA 19 ! 
            <%=nombre %>
            <%=apellido %>
            <%=rol %>
        </h1>
    </body>
</html>
