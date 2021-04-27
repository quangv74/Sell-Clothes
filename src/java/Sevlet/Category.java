/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevlet;

import DAO.DAOImages;
import DAO.DAOPaging;
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
public class Category extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            int id = Integer.parseInt(request.getParameter("id"));
//        response.getWriter().print(id);
//        DAO.DAOcate ca = new DAOcate();
//        ArrayList<Categories> c = ca.getListCateGirl();
//        ArrayList<Categories> d = ca.getListCateBoy();
//        request.setAttribute("listcategirl", c);
//        request.setAttribute("listcateboy", d);
//        request.setAttribute("anh1", new DAOImages().getListPro(id));
//        response.sendRedirect("shop-category-left.jsp");
//        }
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
        int id = 4;
        Categories cat = new Categories(id);
        HttpSession session = request.getSession(true);
        request.setAttribute("cateid1",id);
        session.setAttribute("cateid", cat);
//            response.getWriter().print(id);
        DAO.DAOcate ca = new DAOcate();
        ArrayList<Categories> c = ca.getListCateGirl();
        ArrayList<Categories> d = ca.getListCateBoy();
        request.setAttribute("listcategirl", c);
        request.setAttribute("listcateboy", d);
        int pagesize = 3;
        String page = request.getParameter("page");
        if (page == null || page.length() == 0) {
            page = "1";
        }
//        HttpSession session = request.getSession(true);
//        Categories cat = (Categories)(session.getAttribute("cateid"));
        int pageindex = Integer.parseInt(page);
        DAOPaging db = new DAOPaging();
        ArrayList<Product> pro = db.getPro(pageindex, pagesize, id);
        int totalRecords = db.countPro(id);
        response.getWriter().print(pro.size());
        int totalpage = totalRecords % pagesize == 0
                ? totalRecords / pagesize
                : (totalRecords / pagesize) + 1;

        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pageindex", pageindex);
        request.setAttribute("anh1", pro);
        request.getRequestDispatcher("shop-category-left.jsp").forward(request, response);
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
