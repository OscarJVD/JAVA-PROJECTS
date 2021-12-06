<%-- 
    Document   : Declaraciones
    Created on : 28/04/2020, 08:31:48 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Declaraciones</title>
    </head>
    <body>
        <h1 style="text-align: center">Ejemplo Declaraciones</h1>

        <%!
            private int res = 0;

            public int MetodoSuma(int num, int num2) {

                res = num + num2;

                return res;

            }

            public int MetodoResta(int num, int num2) {

                res = num - num2;

                return res;

            }

            public int MetodoMultiplica(int num, int num2) {

                res = num * num2;

                return res;

            }

        %>
        
        
        <p>El resultado de la suma es: <%= MetodoSuma(7,1000) %></p>
        <p>El resultado de la resta es: <%= MetodoResta(7,1000) %></p>
        <p>El resultado de la multiplicación es: <%= MetodoMultiplica(7,1000) %></p>
        
    </body>
</html>
