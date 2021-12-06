package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.UsuarioVO;
import modeloVO.CategoriaVO;
import modeloDAO.CategoriaDAO;
import modeloVO.DatosVO;
import modeloDAO.DatosDAO;
import modeloVO.VehiculoVO;

public final class actualizarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Sesiones.jsp");
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
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
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                    <li class=\"fas fa-car\"></li>\n");
      out.write("                    Solumotors\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("                <a class=\"navbar-brand text-light mx-5\" href=\"menu.jsp\">Inicio</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("                        <!-- que vaya al controlador user cuando le demos clic -->\n");
      out.write("                        <!-- el index verifica y convierte a camel -->\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item btn-group mx-5 dropdown\">\n");
      out.write("                            <a href=\"consultarVehiculo.jsp\" class=\"navbar-brand text-light\">\n");
      out.write("                                Vehículo\n");
      out.write("                            </a>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-lg btn-dark dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <a href=\"consultarVehiculo.jsp\" class=\"nav-link text-dark\">Consultar vehículo</a>\n");
      out.write("                                <a href=\"registrarVehiculo.jsp\" class=\"nav-link text-dark\" >Registrar vehículo</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item ml-5\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"navbar-brand text-light mx-5\">Cerrar Sesión</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <script src=\"assets/datatable/js/jquery-3.5.1.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            /*EFECTO HOVER DEL DROPDOWN*/\n");
      out.write("            $(function () {\n");
      out.write("                $(\".dropdown\").hover(\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).fadeIn(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                            $('b', this).toggleClass(\"caret caret-up\");\n");
      out.write("                        },\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).fadeOut(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                            $('b', this).toggleClass(\"caret caret-up\");\n");
      out.write("                        });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
    HttpSession miSesion = (HttpSession) request.getSession();  //atrapar alguna sesión
    String id = "";
    if (miSesion.getAttribute("usuario") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    } else {

        UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("usuario");
        id = usuVO.getUsuId();

        //String rol = usuVO.getIdRol();
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row justify-content-center text-center\">\n");
      out.write("    <div class=\"w-100\">\n");
      out.write("        <h1 class=\"text-light bg-dark p-2\">Actualizar Vehículo</h1>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"w-100\">Por favor ingrese la nueva información del vehiculo</p>\n");
      out.write("    ");

        VehiculoVO vehVO = (VehiculoVO) request.getAttribute("vehiculo");
        if (vehVO != null) {
    
      out.write("\n");
      out.write("    <form action=\"vehiculo\" method=\"POST\" class=\"\">\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("            <label for=\"textPlaca\" class=\"col-sm-2 col-form-label col-form-label-sm\">Placa</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" readonly value=\"");
      out.print( vehVO.getVehPlaca());
      out.write("\" name=\"textPlaca\" id=\"textPlaca\" placeholder=\"Ingrese la placa\" class=\"form-control-sm\"  autosave=\"\" aria-describedby=\"emailHelp\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group row d-none\"><!---->\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print( id);
      out.write("\" name=\"textdatId\" class=\"form-control-sm\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("            <label for=\"textCategoria\" class=\"col-sm-2 col-form-label col-form-label-sm\">Categoría</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <select name=\"textCategoria\" id=\"textCategoria\" class=\"form-control-sm\"  autosave=\"\" required>\n");
      out.write("                    <option value=\"\">Seleccione...</option>\n");
      out.write("                    ");

                        CategoriaDAO catDAO = new CategoriaDAO();
                        for (CategoriaVO catVO : catDAO.listar()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( catVO.getCatId());
      out.write("\" selected=\"\">");
      out.print( catVO.getCatTipo());
      out.write("</option>\n");
      out.write("\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("            <label for=\"textModelo\" class=\"col-sm-2 col-form-label col-form-label-sm\">Modelo</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" value=\"");
      out.print( vehVO.getVehModelo());
      out.write("\" name=\"textModelo\" id=\"textModelo\" placeholder=\"Ingrese el modelo\" class=\"form-control-sm\" autosave=\"\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("            <label for=\"textMarca\" class=\"col-sm-2 col-form-label col-form-label-sm\">Marca</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" value=\"");
      out.print( vehVO.getVehMarca());
      out.write("\" name=\"textMarca\" id=\"textMarca\" placeholder=\"Ingrese la marca\" class=\"form-control-sm\"  autosave=\"\" aria-describedby=\"emailHelp\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group row\"> <!--Tengo duda ya que el estado debe ser activo al crear-->\n");
      out.write("            <label for=\"textEstado\" class=\"col-sm-2 col-form-label col-form-label-sm\">Estado</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" value=\"");
      out.print( vehVO.getVehEstado());
      out.write("\" name=\"textEstado\" id=\"textEstado\" placeholder=\"Ingrese el estado\" class=\"form-control-sm\" autosave=\"\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("            <label for=\"textPrecio\" class=\"col-sm-2 col-form-label col-form-label-sm\">Precio</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"number\" value=\"");
      out.print( vehVO.getVehPrecio());
      out.write("\" name=\"textPrecio\" id=\"textPrecio\" placeholder=\"Ingrese el precio\" class=\"form-control-sm\"  autosave=\"\" aria-describedby=\"emailHelp\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"btn btn-info\">Actualizar</button>\n");
      out.write("        <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("        <div class=\"my-2\">\n");
      out.write("            <a href=\"consultarVehiculo.jsp\" class=\"\">Volver</a>\n");
      out.write("        </div>\n");
      out.write("        <!--\n");
      out.write("        <div class=\"my-3\">\n");
      out.write("            <a href=\"index.jsp\" class=\"\">Volver</a>\n");
      out.write("        </div>-->\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("    <h3>¡No se ha seleccionado ningun vehículo!</h3> <!--En el caso en el que se salte a esta vista directamente sin seleccionar un vehiculo-->\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-12 m-3\">\n");
      out.write("        ");
if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("        <div class=\"text-primary\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \n");
      out.write("        </div>\n");
      out.write("        ");
 } else {
      out.write("\n");
      out.write("        <div class=\"text-success\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"assets/datatable/js/jquery-3.5.1.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"assets/js/popper.min.js\"></script>");
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
