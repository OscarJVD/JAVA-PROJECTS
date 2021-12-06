<%-- 
    Document   : consultarVehiculo
    Created on : 11/06/2020, 01:40:58 PM
    Author     : PC-Vargas
--%>

<%@page import="modeloVO.UsuarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.VehiculoDAO"%>
<%@page import="modeloVO.VehiculoVO"%>
<%@include file="Sesiones.jsp" %>
<%
    HttpSession miSesion=(HttpSession)request.getSession();  //atrapar alguna sesión
    if(miSesion.getAttribute("usuario")==null){
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }else{
        UsuarioVO usuVO = (UsuarioVO)miSesion.getAttribute("usuario");
    }
%>


<div class="row justify-content-center text-center formu">
    <div class="w-100">
        <h1 class="text-light bg-dark p-2">Consultar Vehículo</h1>
    </div>
    <p class="w-100">Por favor ingrese la placa del vehiculo que desea consultar</p> 
    <form action="vehiculo" method="POST" class="">
        <div class="form-group row">
            <label for="textPlaca" class="col-sm-2 col-form-label col-form-label-sm">Placa: </label>
            <div class="col-sm-10">
                <input type="text" name="textPlaca" id="textPlaca" placeholder="Ingrese la placa" class="form-control-sm"  autosave="">
            </div>
        </div>
        <button class="btn btn-info">Consultar</button>
        <input type="hidden" value="3" name="opcion">

    </form>
    <div class="col-12 m-3">
        <%if (request.getAttribute("mensajeError") != null) { %>
        <div class="text-primary">
            ${mensajeError}  
        </div>
        <% } %>
    </div>
    <div>
        <table class="table table-hover table-responsive datatable table-sm table-bordered table-striped">
            <thead>
                <tr>
                    <th scope="col">PLACA</th>
                    <th scope="col">DATOS</th>
                    <th scope="col">CATEGORÍA</th>
                    <th scope="col">MODELO</th>
                    <th scope="col">MARCA</th>
                    <th scope="col">ESTADO</th>
                    <th scope="col">PRECIO</th>
                </tr>
            </thead>
            <tbody>
                <%
                    VehiculoVO vehVO = new VehiculoVO();
                    VehiculoDAO vehDAO = new VehiculoDAO();

                    ArrayList<VehiculoVO> listarVehiculos = vehDAO.listar(); //el arreglo se recibe con otro arreglo
                    for (int i = 0; i < listarVehiculos.size(); i++) {
                        vehVO = listarVehiculos.get(i);

                %>
                <tr>
                    <th scope="row"><%= vehVO.getVehPlaca()%></th>
                    <td><%= vehVO.getDatId()%></td>
                    <td><%= vehVO.getCatId()%></td>
                    <td><%= vehVO.getVehModelo()%></td>
                    <td><%= vehVO.getVehMarca()%></td>
                    <td><%= vehVO.getVehEstado()%></td>
                    <td><%= vehVO.getVehPrecio() %></td>
                </tr>
                <% }%>
            </tbody>
        </table> 
    </div>
</div>

<%@include file="Footer.jsp" %>

<script src="assets/datatable/js/jquery.dataTables.min.js"></script>
<script src="assets/datatable/js/dataTables.bootstrap4.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>

<script>

    // DATATABLE EN ESPAÑOL: PRESENTABA ERROR CON EL COLSPAN DE LA TABLA
    $(document).ready(function () {
        $('.datatable').DataTable({
            "language": {
                "url": "assets/datatable/js/Spanish.json"
            }
        });
    });

</script>