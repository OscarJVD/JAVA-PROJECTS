<%-- 
    Document   : Form
    Created on : 19/06/2020, 09:11:32 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORM DINÁMICO</title>
    </head>
    <body>
        <h1>FORM DINÁMICO</h1>
        <form action="">
            <input type="submit" name="genero" value="Mujer">
            <input type="submit" name="genero" value="Hombre">
            
        </form>
        <%
          if(request.getParameter("genero")!=null){
                if(request.getParameter("genero").equals("Mujer")){
        %>

        <div>        
            <h2>Bienvenida</h2>
        </div>
        <form action="">
            <label>Preferencias:</label>
            <select>
                <option value="">Deportes</option>
                <option value="">Baile</option>
                <option value="">Canto</option>
            </select>
        </form>
        
        <input type="button" value="Guardar">

        <% }if(request.getParameter("genero").equals("Hombre")){%>
        
        <div>
            <h3>Bienvenido</h3>
        </div>
        <form action="">
            <label>Equipo Favorito:</label>
            Azul<input type="radio" name="equipo">
            Rojo<input type="radio" name="equipo">
            Verde<input type="radio" name="equipo">
        </form>
        <input type="button" value="Guardar">
        
        <%
            }}
        %>



        

    </body>
</html>
