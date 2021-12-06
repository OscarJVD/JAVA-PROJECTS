package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Declaraciones_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            private int res = 0;

            public int MetodoSuma(int num, int num2) {

                res = num + num2;

                return res;

            }

            public int MetodoResta(int num, int num2) {

                res = num - num2;

                return res;

            }

            public int MetodoMultiplica(int num, int num2) {

                res = num * num2;

                return res;

            }

        
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
      out.write("        <title>Ejemplo Declaraciones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align: center\">Ejemplo Declaraciones</h1>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <p>El resultado de la suma es: ");
      out.print( MetodoSuma(7,1000) );
      out.write("</p>\n");
      out.write("        <p>El resultado de la resta es: ");
      out.print( MetodoResta(7,1000) );
      out.write("</p>\n");
      out.write("        <p>El resultado de la multiplicación es: ");
      out.print( MetodoMultiplica(7,1000) );
      out.write("</p>\n");
      out.write("        \n");
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
