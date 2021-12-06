<%-- 
    Document   : Calculos
    Created on : 28/04/2020, 08:50:01 PM
    Author     : PC-Vargas
--%>

<%@page import="oscarvargas.com.CalculosMatematicos.Calculos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modularizar</title>
    </head>
    <body>
        <h1>Haciendo referencia a clases java para modularizar</h1>
        <div>
          La suma de 4 y 2 es:   <%= Calculos.MetodoSuma(4, 2) %>
        </div>
        <div>
          La resta de 4 y 2 es:   <%= Calculos.MetodoResta(4, 2) %>
        </div>
        <div>
          La multiplicación de 4 y 2 es:   <%= Calculos.MetodoMultiplica(4, 2) %>
        </div>

    </body>
</html>
