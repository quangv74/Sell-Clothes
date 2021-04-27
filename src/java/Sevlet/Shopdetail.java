/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevlet;

import DAO.DAOImages;
import DAO.DAOSize;
import DAO.DAOcate;
import Entity.Categories;
import Entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author my laptop
 */
public class Shopdetail extends HttpServlet {

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
//            int id = Integer.parseInt(request.getParameter("id"));
//            HttpSession session = request.getSession(true);
//            Categories cat = (Categories)(session.getAttribute("cateid"));
//            DAOImages i = new DAOImages();
//            request.setAttribute("anh", i.getListPro1(2,25));
//            request.getRequestDispatcher("shop-detail.jsp").forward(request, response);
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
        HttpSession session = request.getSession(true);
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        Categories cat = (Categories) (session.getAttribute("cateid"));
        Product p = new Product();
        p.setProid(id);
        session.setAttribute("idproduct", p);
        DAO.DAOcate ca = new DAOcate();
        ArrayList<Categories> c = ca.getListCateGirl();
        ArrayList<Categories> d = ca.getListCateBoy();
        request.setAttribute("listcategirl", c);
        request.setAttribute("listcateboy", d);
        DAOImages i = new DAOImages();
//            request.setAttribute("anh", i.getListPro(id));
        request.setAttribute("anh", i.getPro1(cat.getCateid(), id));
        request.setAttribute("listsize", new DAOSize().getListSize(1));
        request.getRequestDispatcher("shop-detail.jsp").forward(request, response);
        
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
