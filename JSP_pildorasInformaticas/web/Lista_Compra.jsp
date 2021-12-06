<%@ page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        <form name="Formulario_Compra" action="Lista_Compra.jsp">

            <p>Articulos a comprar en Solushop:</p>
            <p>
                <label>
                    <input type="checkbox" name="articulos" value="agua " >
                    Agua </label>
                <br>
                <label>
                    <input type="checkbox" name="articulos" value="leche" >
                    Leche </label>
                <br>
                <label>
                    <input type="checkbox" name="articulos" value="pan" >
                    Pan </label>
                <br>
                <label>
                    <input type="checkbox" name="articulos" value="mazanas" >
                    Manzanas </label>
                <br>
                <label>
                    <input type="checkbox" name="articulos" value="carne" >
                    Carne </label>
                <br>
                <label>
                    <input type="checkbox" name="articulos" value="pescado" >
                    Pescado </label>
            </p>
            <p>
                <input type="submit" name="button" id="button" value="Enviar">
                <br>
            </p>
        </form>
        <p></p>
        <h1> Carrito de compra</h1>
        <ul>
    
   

        <%
            
            //ARRAYLIST con casting de obj a string
            List<String> Lista_Elementos=(List<String>)session.getAttribute("misElementos");
            
            //VERIFICAR EL ARRAYLIST E INICIALIZARLO
            if (Lista_Elementos==null) {
               
                //INICIALIZARLO
               Lista_Elementos=new ArrayList<String>(); 
               
               session.setAttribute("misElementos", Lista_Elementos);
               
               
                
             }

            String[] elementos = request.getParameterValues("articulos");

            if (elementos != null) {

                for (String elemTemp  : elementos) {

                    //out.println("<li>" + elemTemp + "</li>");
                    //PASAR ELEMNTOS DE UN ARRAY A OTRO
                    Lista_Elementos.add(elemTemp);

                }

            }
            
            //imprimir elementos
            for(String elemTemp: Lista_Elementos ){
            
                out.println("<li>" + elemTemp + "</li>");
            
            }


            
        %>    

</ul>

    </body>

</html>