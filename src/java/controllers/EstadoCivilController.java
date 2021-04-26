    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EstadosCiviles;
import modelDAO.EstadosCivilesDAO;

/**
 *
 * @author Omar Fer
 */
@WebServlet(name = "EstadoCivilController", urlPatterns = {"/EstadoCivilController"})
public class EstadoCivilController extends HttpServlet {
    String listar = "views/listar.jsp";
    String crear = "views/create.jsp";
    
    EstadosCivilesDAO dao = new EstadosCivilesDAO();
    EstadosCiviles ec = new EstadosCiviles();
    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EstadoCivilController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EstadoCivilController at " + request.getContextPath() + "</h1>");
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
        String acceso = "";
        String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("listar")){
            acceso = listar;
        }
        else if(accion.equalsIgnoreCase("add")){
            acceso = crear;
        }
        else if(accion.equalsIgnoreCase("Agregar")){
            String desc = request.getParameter("txtEstadoCivil");
            ec.setEsCiv_Descripcion(desc);
            dao.add(ec);
            acceso = listar;
        }
        //INVESTIGAR QUE HACE ADEMAS DE REEDIRIGIR
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
       // processRequest(request, response);
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
