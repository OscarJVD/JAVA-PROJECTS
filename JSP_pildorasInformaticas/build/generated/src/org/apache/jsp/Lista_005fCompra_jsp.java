package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Lista_005fCompra_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <form name=\"Formulario_Compra\" action=\"Lista_Compra.jsp\">\r\n");
      out.write("\r\n");
      out.write("            <p>Articulos a comprar en Solushop:</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"articulos\" value=\"agua \" >\r\n");
      out.write("                    Agua </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"articulos\" value=\"leche\" >\r\n");
      out.write("                    Leche </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"articulos\" value=\"pan\" >\r\n");
      out.write("                    Pan </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"articulos\" value=\"mazanas\" >\r\n");
      out.write("                    Manzanas </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"articulos\" value=\"carne\" >\r\n");
      out.write("                    Carne </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"articulos\" value=\"pescado\" >\r\n");
      out.write("                    Pescado </label>\r\n");
      out.write("            </p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <input type=\"submit\" name=\"button\" id=\"button\" value=\"Enviar\">\r\n");
      out.write("                <br>\r\n");
      out.write("            </p>\r\n");
      out.write("        </form>\r\n");
      out.write("        <p></p>\r\n");
      out.write("        <h1> Carrito de compra</h1>\r\n");
      out.write("        <ul>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("        ");

            
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


            
        
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
