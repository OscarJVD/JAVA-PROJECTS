/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.VehiculoDAO;
import modeloVO.VehiculoVO;

/**
 *
 * @author PC-Vargas
 */
@WebServlet(name = "VehiculoControlador", urlPatterns = {"/vehiculo"})
public class VehiculoControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter(); //ESTO ES PARA IMPRIMIR ALGO CON EL SERVLET

        int opcion = Integer.parseInt(request.getParameter("opcion")); //recoge el value

        String vehPlaca = request.getParameter("textPlaca");
        String datId = request.getParameter("textdatId");
        //String datNumeroId = request.getParameter("textdatNumeroId");
        String catId = request.getParameter("textCategoria");
        //String caTipo = request.getParameter("textcaTipo");
        String vehModelo = request.getParameter("textModelo");
        String vehMarca = request.getParameter("textMarca");
        String vehEstado = request.getParameter("textEstado");
        String vehPrecio = request.getParameter("textPrecio");

        VehiculoVO vehVO = new VehiculoVO(vehPlaca, datId,
                catId, vehModelo, vehMarca, vehEstado, vehPrecio);

        VehiculoDAO vehDAO = new VehiculoDAO(vehVO);

        switch (opcion) {

            case 1: //Agregar registro

                if (vehDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "¡El vehiculo se registro correctamente!"); //mandar mensaje a la vista

                } else {

                    request.setAttribute("mensajeError", "¡Error intentelo de nuevo!"); //mensajeError es una variable

                }

                //REDIRECCIONAMIENTO DEL MENSAJE A UNA VISTA
                request.getRequestDispatcher("registrarVehiculo.jsp").forward(request, response);

                break;

            case 2: //Actualizar Registro

                if (vehDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "Vehiculo actalizado con exito :l"); //mandar mensaje a la vista

                } else {

                    request.setAttribute("mensajeError", "Algo salio mal :l vuelve a intentarlo mas tarde");
                }

                //REDIRECCIONAMIENTO DEL MENSAJE A UNA VISTA
                request.getRequestDispatcher("actualizarVehiculo.jsp").forward(request, response);

                break;

            case 3: //Consultar o listar por placa

                vehVO = VehiculoDAO.consultarPlaca(vehPlaca); //objeto vo que llama el metodo que recibe la placa para poder consultar

                if (vehVO != null) {

                    request.setAttribute("vehiculo", vehVO); //en el jsp se recibe con etiquetas java

                    request.getRequestDispatcher("actualizarVehiculo.jsp").forward(request, response); //se consulta para poder actualizarse
                    request.getRequestDispatcher("Footer.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "¡El vehiculo no existe!");
                    request.getRequestDispatcher("consultarVehiculo.jsp").forward(request, response);

                }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
