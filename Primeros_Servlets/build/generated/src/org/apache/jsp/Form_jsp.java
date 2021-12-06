package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>FORM DINÁMICO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>FORM DINÁMICO</h1>\n");
      out.write("        <form action=\"\">\n");
      out.write("            <input type=\"submit\" name=\"genero\" value=\"Mujer\">\n");
      out.write("            <input type=\"submit\" name=\"genero\" value=\"Hombre\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        ");

          if(request.getParameter("genero")!=null){
                if(request.getParameter("genero").equals("Mujer")){
        
      out.write("\n");
      out.write("\n");
      out.write("        <div>        \n");
      out.write("            <h2>Bienvenida</h2>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"\">\n");
      out.write("            <label>Preferencias:</label>\n");
      out.write("            <select>\n");
      out.write("                <option value=\"\">Deportes</option>\n");
      out.write("                <option value=\"\">Baile</option>\n");
      out.write("                <option value=\"\">Canto</option>\n");
      out.write("            </select>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <input type=\"button\" value=\"Guardar\">\n");
      out.write("\n");
      out.write("        ");
 }if(request.getParameter("genero").equals("Hombre")){
      out.write("\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <h3>Bienvenido</h3>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"\">\n");
      out.write("            <label>Equipo Favorito:</label>\n");
      out.write("            Azul<input type=\"radio\" name=\"equipo\">\n");
      out.write("            Rojo<input type=\"radio\" name=\"equipo\">\n");
      out.write("            Verde<input type=\"radio\" name=\"equipo\">\n");
      out.write("        </form>\n");
      out.write("        <input type=\"button\" value=\"Guardar\">\n");
      out.write("        \n");
      out.write("        ");

            }}
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
