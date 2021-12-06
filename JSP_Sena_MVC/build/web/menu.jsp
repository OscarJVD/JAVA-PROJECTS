<%-- 
    Document   : menu
    Created on : 27/05/2020, 05:02:53 PM
    Author     : PC-Vargas
--%>

<%@page import="modeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>

<%    
    HttpSession miSesion = (HttpSession) request.getSession();  //atrapar alguna sesión
    String nombre = "";
    if (miSesion.getAttribute("usuario") == null) {
        //response.sendRedirect("http://localhost:8080/JSP_Sena_MVC/index.jsp");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("usuario");
        nombre = usuVO.getUsuLogin();
 
    }
%>

<div class="text-center p-5 m-5">
    <h2>Te damos la bienvenida: <%=nombre%></h2><!--esta es la variable nombre-->
    <!--<p class="mb-5 pb-5">Tu rol es:</p>-->
</div>


<%@include file="Footer.jsp" %>

<script src="assets/datatable/js/jquery-3.5.1.js"></script>

<script src="assets/js/bootstrap.min.js"></script>

<script src="assets/js/popper.min.js"></script>



