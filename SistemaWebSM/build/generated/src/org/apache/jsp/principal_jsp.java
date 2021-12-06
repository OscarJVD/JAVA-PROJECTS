package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("                .btn-light{color: #000000}\r\n");
      out.write("                .black-background {background-color:#000000;}\r\n");
      out.write("                .white {color:#ffffff;}\r\n");
      out.write("                .white{font-size: 16px; color: #ffffff}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("            <title>Solumobil | Inicio</title>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container mt-4 col-lg-4\">\r\n");
      out.write("                <div class=\"card col-sm-11\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"form-sign\" action=\"Validar\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group text-center\">\r\n");
      out.write("\r\n");
      out.write("                                <h3>Iniciar Sesión</h3>\r\n");
      out.write("\r\n");
      out.write("                                <img src=\"img/logo.png\" alt=\"70\" \r\n");
      out.write("                                     width=\"110\" height=\"122\"/>\r\n");
      out.write("\r\n");
      out.write("                                <br><br>\r\n");
      out.write("                                <label>Te damos la bienvenida</label>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                <label>Correo electrónico o teléfono</label>\r\n");
      out.write("                                <input type=\"text\" name=\"txtuser\" class=\"form-control\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                <label>Contraseña</label>\r\n");
      out.write("                                <input type=\"password\" name=\"txtpass\" class=\"form-control\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Iniciar Sesión\" \r\n");
      out.write("                                   class=\"btn btn-light btn-block\r\n");
      out.write("                                   black-background white\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        </body>\r\n");
      out.write("    </html>\r\n");
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
