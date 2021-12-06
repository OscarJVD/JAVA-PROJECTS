<%-- 
    Document   : Formulario
    Created on : 29/04/2020, 03:48:25 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Encuestica Sencilla</h1>

        <form>
            <h1>¿Cual es tu genero?</h1>
            <label>Mujer</label>
            <input type="submit" value="Mujer" name="Genero"><p></p>
            <label>Hombre</label>
            <input type="submit" value="Hombre" name="Genero"><p></p>
            <input type="submit" name="enviar" value="enviar">



        </form>

        <%

            if (request.getParameter("Genero") != null) {

                if (request.getParameter("Genero").equals("Mujer")) { %>

        <h2>Bienvenida</h2>
        <label>Libros preferentes para que usted escoja</label>
        <form>
            <select>
                <option name="libro">Seleccione</option>
                <option name="libro">Rebelión en la granja</option>
                <option name="libro">La biblía</option>
                <option name="libro">Aventuras de un niño de la calle</option>
            </select>
             <input type="submit" value="Enviar">

        </form>
        <%} else if (request.getParameter("Genero").equals("Hombre")) { %>      

        <h3>Bienvenido</h3>
        <label>Elija el deporte : </label>
        <form>
            
            
            Futbol<input name="deporte" type="submit" value="Futbol"><p></p>
            Ajedrez<input name="deporte" type="submit" value="Ajedrez"><p></p>
            Tenis<input name="deporte" type="submit" value="Tenis"><p></p>
            <input type="submit" value="Enviar">

        </form>

        <%}
        }%>


      

    </body>
</html>
