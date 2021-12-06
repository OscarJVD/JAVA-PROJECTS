/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.solumobil.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC-Vargas
 */
public class Primer_Servlet extends HttpServlet {

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
        
        Operaciones dividir=new Operaciones();
        
        double n1=Double.parseDouble(request.getParameter("n1"));
        double n2=Double.parseDouble(request.getParameter("n2"));
        
        String select=request.getParameter("select");
        double res=0;
        
        switch(select){
        
            case "suma": 
                res = n1 + n2;
                break;
            case "resta": 
                res = n1 - n2;
                break;
            case "seno": 
                //CONCEPTO DE TRIGO QUE PRIMERO A QUE CONVERTIR A RADIANES
                res = Math.sin(Math.toRadians(n1));
                break;
            case "division":
                res = dividir.Dividir(n1, n2);
                break;
        
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Primer_Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Primer_Servlet at " + request.getContextPath() + "</h1>");
            out.println("<h2>El resultado de la operación es: " + res +"</h2>");
            out.println("</body>");
            out.println("</html>");
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

        //1. ESPECIFICAMOS EL FORMATO DE RESPUESTA (HTML)
        PrintWriter salida = response.getWriter();

        //2. GENERAR RESPUESTA DE LA PETICIÓN
        salida.println("<html><body>");
        salida.println("<h1 style='text-align: center'>PRUEBA DE UN SERVLET</h1>");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("Fecha y hora actual: " + new Date());
        salida.println("</body></html>");

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
