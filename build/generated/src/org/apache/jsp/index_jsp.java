package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alumnos. Yosef</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--FORMULARIO---->\n");
      out.write("        <form class=\"form\" method=\"POST\" action=\"Sprocesar\">\n");
      out.write("\n");
      out.write("            <!--TITULO------------------------>\n");
      out.write("            <h1 class=\"titulo\">Registros de Alumnos</h1>\n");
      out.write("\n");
      out.write("            <!--CAJAS-DE-ENTRADA-DE-DATOS------------------------------------------------>\n");
      out.write("            <input class=\"txfMatricula\" name=\"txfMatricula\" type=\"text\" placeholder=\"Matricula\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfNombre\" name=\"txfNombre\" type=\"text\" placeholder=\"Nombre\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfApellidoP\" name=\"txfApellidoP\" type=\"text\" placeholder=\"ApellidoP\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfApellidoM\" name=\"txfApellidoM\" type=\"text\" placeholder=\"ApellidoM\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfDDI\" name=\"txfDDI\" type=\"number\" placeholder=\"DDI\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfDWI\" name=\"txfDWI\" type=\"number\" placeholder=\"DWI\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfECBD\" name=\"txfECBD\" type=\"number\" placeholder=\"ECBD\" required maxlength=\"30\">\n");
      out.write("            <!--BOTON-DE-REGISTRAR-------------------------->\n");
      out.write("            <input type=\"submit\" class=\"btnRegistrar\" name=\"btnRegistrar\" value=\"REGISTRAR\">\n");
      out.write("        </form>\n");
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
