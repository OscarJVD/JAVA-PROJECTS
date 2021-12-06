<%-- 
    Document   : registrarUsuario
    Created on : 27/05/2020, 03:54:48 PM
    Author     : PC-Vargas
--%>
<%@page import="modeloVO.UsuarioVO"%>
<%@page import="modeloVO.CategoriaVO"%>
<%@page import="modeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>

<%    
    
    HttpSession miSesion = (HttpSession) request.getSession();  //atrapar alguna sesión
    String id = "";
    if (miSesion.getAttribute("usuario") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    } else {

        UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("usuario");
        id = usuVO.getUsuId();
       
        //String rol = usuVO.getIdRol();
    }
%>

<div class="row justify-content-center text-center">
    <div class="w-100">
        <h1 class="text-light bg-dark p-2">Registrar Vehículo</h1>
    </div>
    <p class="w-100">Por favor ingrese la información del vehiculo</p> 
    <form action="vehiculo" method="POST" class="">
        <div class="form-group row">
            <label for="textPlaca" class="col-sm-2 col-form-label col-form-label-sm">Placa</label>
            <div class="col-sm-10">
                <input type="text" name="textPlaca" id="textPlaca" placeholder="Ingrese la placa" class="form-control-sm" aria-describedby="emailHelp" required>
            </div>
        </div>
        <div class="form-group row d-none"><!---->
            <div class="col-sm-10">
                <input type="hidden" value="<%= id %>" name="textdatId" class="form-control-sm" required>
            </div>
        </div>
        <div class="form-group row">    
            <label for="textCategoria" class="col-sm-2 col-form-label col-form-label-sm">Categoría</label>
            <div class="col-sm-10">
                <select name="textCategoria" id="textCategoria" class="form-control-sm"  autosave="" required>
                    <option value="">Seleccione...</option>
                    <%
                        CategoriaDAO catDAO = new CategoriaDAO();
                        for (CategoriaVO catVO : catDAO.listar()) {
                    %>

                    <option value="<%= catVO.getCatId()%>"><%= catVO.getCatTipo()%></option>

                    <% } %>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="textModelo" class="col-sm-2 col-form-label col-form-label-sm">Modelo</label>
            <div class="col-sm-10">
                <input type="text" name="textModelo" id="textModelo" placeholder="Ingrese el modelo" class="form-control-sm" autosave="" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="textMarca" class="col-sm-2 col-form-label col-form-label-sm">Marca</label>
            <div class="col-sm-10">
                <input type="text" name="textMarca" id="textMarca" placeholder="Ingrese la marca" class="form-control-sm"  autosave="" aria-describedby="emailHelp" required>
            </div>
        </div>
        <div class="form-group row"> <!--Tengo duda ya que el estado debe ser activo al crear-->
            <label for="textEstado" class="col-sm-2 col-form-label col-form-label-sm">Estado</label>
            <div class="col-sm-10">
                <input type="text" name="textEstado" id="textEstado" placeholder="Ingrese el estado" class="form-control-sm" autosave="" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="textPrecio" class="col-sm-2 col-form-label col-form-label-sm">Precio</label>
            <div class="col-sm-10">
                <input type="number" name="textPrecio" id="textPrecio" placeholder="Ingrese el precio" class="form-control-sm"  autosave="" aria-describedby="emailHelp" required>
            </div>
        </div>
        <button class="btn btn-info">Registrar</button>
        <input type="hidden" value="1" name="opcion">
        <!--
        <div class="my-3">
            <a href="index.jsp" class="">Volver</a>
        </div>-->

    </form>
    <div class="col-12 m-3">
        <%if (request.getAttribute("mensajeError") != null) { %>
        <div class="text-primary">
            ${mensajeError}  
        </div>
        <% } else {%>
        <div class="text-success">
            ${mensajeExito}
        </div>
        <% }%>
    </div>
</div>
    
<%@include file="Footer.jsp" %>
<script src="assets/datatable/js/jquery.dataTables.min.js"></script>
<script src="assets/datatable/js/dataTables.bootstrap4.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>


