package servletv1;

import alumnos.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp_Corei7
 */
public class Sprocesar extends HttpServlet {

    private Alumno alumnos[] = new Alumno[10];
    private int cont = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (request.getParameter("btnRegistrar") != null) {
            alumnos[cont] = new Alumno();
            alumnos[cont].setMatricula(request.getParameter("txfMatricula"));
            alumnos[cont].setNombre(request.getParameter("txfNombre"));
            alumnos[cont].setApellidoP(request.getParameter("txfApellidoP"));
            alumnos[cont].setApellidoM(request.getParameter("txfApellidoM"));
            alumnos[cont].setDdi(Integer.parseInt(request.getParameter("txfDDI")));
            alumnos[cont].setDwi(Integer.parseInt(request.getParameter("txfDWI")));
            alumnos[cont].setEcbd(Integer.parseInt(request.getParameter("txfECBD")));

            cont++;

        }

        if (request.getParameter("btnRegistrar") != null) {

            out.println(""
                    + " <table class=\"table table-responsive table-bordered table-hover table-dark\">"
                    + " <thead>"
                    +"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">"
                    +" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">"
                    +"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>"
                    +"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>"
                    +"<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>"
                    +" <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>"
                    +" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js\" integrity=\"sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2\" crossorigin=\"anonymous\"></script>"
                    +"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>"
                    + "<tr>"
                    + "<th>" + "Matricula" + "</th>"
                    + "<th>" + "Nombre completo" + "</th>"
                    + "<th>" + "ddi" + "</th>"
                    + "<th>" + "dwi" + "</th>"
                    + "<th>" + "ecbd" + "</th>"
                    + "<th>" + "Promedio" + "</th>"
                    + "</tr>"
                    + "  </thead>"
                    + " <tbody>"
                    );

            for (int i = 0; i < cont; i++) {
                out.print("<tr>");
                out.print("<td>" + alumnos[i].getMatricula() + "</td>");
                out.print("<td>" + alumnos[i].getNombre() + " " + alumnos[i].getApellidoP() + " " + alumnos[i].getApellidoM() + "</td>");
                out.print("<td>" + alumnos[i].getDdi() + "</td>");
                out.print("<td>" + alumnos[i].getDwi() + "</td>");
                out.print("<td>" + alumnos[i].getEcbd() + "</td>");
                out.print("<td>" + alumnos[i].getProm() + "</td>");
                out.print("</tr>");
            }
            out.println(""
                    + "   </tbody>"
                    + " </table>");

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
