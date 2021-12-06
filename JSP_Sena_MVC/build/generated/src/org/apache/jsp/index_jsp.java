package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.UsuarioVO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Footer.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //que no puedan darle retroceder store ->
    response.setDateHeader("Expires", 0);

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" lang=\"es\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"Author\" lang=\"es\" content=\"Óscar Javier Vargas Diaz, oscarjaviervargas@hotmail.com\"> \n");
      out.write("        <meta name=\"DC.identifier\" lang=\"es\" content=\"\"><!--Aqui va la pagina SOLUMOBIL.............................-->\n");
      out.write("        <META http-equiv=\"Expires\" lang=\"es\" content=\"0\"><!--ESTA NOSE PARA QUE ES.-->\n");
      out.write("        <meta name=\"Keywords\" lang=\"es\" content=\"Engativa,Colombia, Bogota,\n");
      out.write("              app venta de carros, administración de venta de carros, proyecto de software hecho como trabajo del Sena, aplicación para poder comprar autos\">\n");
      out.write("        <META http-equiv=\"PICS-Label\" content='\n");
      out.write("              (PICS-1.1 \"http://www.gcf.org/v2.5\"\n");
      out.write("              labels on \"1994.11.05T08:15-0500\"\n");
      out.write("              until \"1995.12.31T23:59-0000\"\n");
      out.write("              for \"http://w3.org/PICS/Overview.html\"\n");
      out.write("              ratings (suds 0.5 density 0 color/hue 1)) \n");
      out.write("              '>\n");
      out.write("        <META name=\"copyright\" content=\"&copy; 2020 Solupelís Company.\">\n");
      out.write("        <meta name=\"Description\" lang=\"es\" content=\"Software de administracíon de autos \n");
      out.write("              Desarrollar una aplicación WEB en lenguaje de programación JAVA utilizando\n");
      out.write("              MVC, que implemente un módulo para un sistema de información de\n");
      out.write("              comercialización de vehículos, realice el diseño de la base de datos que\n");
      out.write("              considere pertinente para la prueba. El modulo debe contar obligatoriamente con\n");
      out.write("              las siguientes funcionalidades:\n");
      out.write("              \">\n");
      out.write("        <META name=\"date\" content=\"19:05:09, sábado 29, febrero 2020 -05\">\n");
      out.write("        <meta name=\"generator\" content=\"HTML-KIT 2.9\"/>\n");
      out.write("        <meta name=\"language\" content=\"es\"/>\n");
      out.write("        <meta name=\"revisit-after\" content=\"1 month\"/>\n");
      out.write("        <meta name=\"robots\" content=\"index, follow\"/>\n");
      out.write("        <meta name=\"application-name\" content=\"Solupelís\" />\n");
      out.write("        <meta name=\"encoding\" charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"300\" />\n");
      out.write("        <meta http-equiv=»X-UA-Compatible». />\n");
      out.write("        <meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge, chrome=1\" />\n");
      out.write("        <meta name=\"organization\" content=\"Solumotors Company\" />\n");
      out.write("        <meta name=\"revisit\" content=\"7\" />\n");
      out.write("\n");
      out.write("        <!----------------------------------------------------------------------------------->\n");
      out.write("        <!----------------------------------------------------------------------------------->\n");
      out.write("        <!--TERMINA AQUI --------------------------------------------------------------META-->\n");
      out.write("        <!----------------------------------------------------------------------------------->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/indexStyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrapSimplex.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"Shortcut Icon\" href=\"assets/img/2.1.ico\"/>\n");
      out.write("\n");
      out.write("        <!-- FONTAWESOME -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font/css/all.css\">\n");
      out.write("\n");
      out.write("        <title>Solumotors</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row justify-content-center text-center navIndex w-100\">\n");
      out.write("            <div class=\"w-100\">\n");
      out.write("                <h1 class=\"text-light bg-dark p-2\">Iniciar Sesión</h1>\n");
      out.write("            </div>\n");
      out.write("            <h6 class=\"w-100 text-light pt-3 mt-3\">Es facíl y rapido.</h6> \n");
      out.write("            <form action=\"Usuario\" method=\"POST\" class=\"col-12 mb-2 pb-2\">\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"text\" placeholder=\"Ingrese Usuario\" name=\"textUsuario\" required=\"\" autocomplete=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"my-2 mb-3 text-center\">\n");
      out.write("                    <input type=\"password\" placeholder=\"Ingrese Clave\" name=\"textPassword\" required=\"\" autocomplete=\"\">\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-info btn-sm\">Iniciar Sesión</button>\n");
      out.write("                <a href=\"registrarUsuario.jsp\" class=\"btn btn-warning btn-sm\">Crear cuenta</a>\n");
      out.write("                <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                <div class=\"my-2 col-12\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");
if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("            <div col-12><p class=\"texto-blanco\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            <div col-12><p class=\"texto-blanco\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"slashed col-12 pt-2 mt-2 pb-5 mb-5\">\n");
      out.write("                <div class=\"top\" title=\"Solumotors\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<footer class=\"mainfooter\" role=\"contentinfo\">\n");
      out.write("    <div class=\"footer-middle\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 copy\">\n");
      out.write("                    <p class=\"text-center border-dark rounded-pill bg-light p-2\">&copy; Copyright 2020 - Solumotors.  All rights reserved.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
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
