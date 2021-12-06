<%-- 
    Document   : MiprimerJSP
    Created on : 19/06/2020, 08:56:41 PM
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
        <h1>Mi JSP!</h1>
        
        <%
        double num1;
        %>
        
        <h2>¡Programemos!</h2>
        
        <%
        double num2 = 1;
        num1 = 2;
        double res = 0;
        if(num1 != num2){
        res = num1 + num2;
        }
        %>
        
        <h3>El resultado de la suma es =</h3>
        <div><%= res %></div>

    </body>
</html>
