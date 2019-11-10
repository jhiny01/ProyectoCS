/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.dao.PersonaDAO;
import modelos.dtos.personadto;

public class controperso_res extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sesion = request.getSession();
        String id_emp = request.getParameter("id_empleado");
        String num_empl = request.getParameter("num_empleado");
        String nom = request.getParameter("nombre");
        String ape = request.getParameter("apellido");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        String corr = request.getParameter("correo");
        String ocp = request.getParameter("ocupacion");
        
        personadto p = new personadto();
        
        p.setId_empleado(Integer.parseInt(id_emp));
        p.setNum_empleado(Integer.parseInt(num_empl));
        p.setNombre(nom);
        p.setApellido(ape);
        p.setTelefono(tel);
        p.setDireccion(dir);
        p.setCorreo(corr);
        p.setOcupacion(ocp);
        
        PersonaDAO pdao = new PersonaDAO();
        //ArrayList<personadto> listaP = pdao.consultarPersona(p);
        
        
        
        //sesion.setAttribute("listaP", listaP);
        
        response.sendRedirect("./jsp/persona.jsp");
    }
    
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

    private void setAttribute(String var1, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
