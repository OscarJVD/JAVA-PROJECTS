/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import modeloVO.UsuarioVO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modeloDAO.UsuarioDAO;

/**
 * aqui viene y va la información
 *
 * @author PC-Vargas
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})

public class UsuarioControlador extends HttpServlet {

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
        //------------------------------------------------------------------------
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //------------------------------------------------------------------------

        String usuId = request.getParameter("textId");
        String usuLogin = request.getParameter("textUsuario");
        String usuPassword = request.getParameter("textPassword");
        int opcion = Integer.parseInt(request.getParameter("opcion")); //esto lo envia el boton

        UsuarioVO usuVO = new UsuarioVO(usuId, usuLogin, usuPassword);
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO); //se asocian los datos

        switch (opcion) {

            case 1: //Agregar registro

                if (usuDAO.agregarRegistro()) { //Se valida que el metodo retorne la variable operación true

                    request.setAttribute("mensajeExito", "El usuario se registro correctamente"); //mandar mensaje a la vista

                } else {

                    request.setAttribute("mensajeError", "Algo salio mal");

                }

                //REDIRECCIONAMIENTO DEL MENSAJE A UNA VISTA permitiendo mantener las peticiones
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;

            case 2: //Actualizar Registro

                if (usuDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "Usuario actalizado con exito :l"); //mandar mensaje a la vista

                } else {

                    request.setAttribute("mensajeError", "Algo salio mal vuelve a intentarlo mas tarde");
                }

                //REDIRECCIONAMIENTO DEL MENSAJE A UNA VISTA
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                break;

            case 3: //Validacion de usuario - Inicio de sesión

                if (usuDAO.inicioSesion(usuLogin, usuPassword)) {//Se valida que el metodo retorne la variable  true

                    UsuarioDAO obtIdUsuario = new UsuarioDAO();  // objeto DAO con sus metodos
                    String idUsu = obtIdUsuario.obtIdUsuario(usuLogin, usuPassword);
                    
                    //Asunto Rol
                    /*UsuarioDAO idUserId = new UsuarioDAO();
                    String idRol = idUserId.traerIRol(idusuario);
                    */
                    
                    HttpSession miSesion = request.getSession(true); //objeto de sesion -> se crea la sesion
                    
                    //usuVO = new UsuarioVO(idusuario, usuLogin, "", idRol);
                    
                    usuVO = new UsuarioVO(idUsu, usuLogin);
                    miSesion.setAttribute("usuario", usuVO);
                    request.getRequestDispatcher("menu.jsp").forward(request, response);

                } else {
                    
                    request.setAttribute("mensajeError", "El usuario y/o contraseña son incorrectos");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    
                }
                break;

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
