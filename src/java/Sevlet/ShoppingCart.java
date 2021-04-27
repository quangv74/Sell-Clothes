/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevlet;

import DAO.DAOOrder;
import Entity.Order;
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
public class ShoppingCart extends HttpServlet {

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
        boolean check = false;
        HttpSession session = request.getSession(true);
        if(session.getAttribute("account")==null){
            response.sendRedirect("Register");
        }else{
            /* TODO output your page here. You may use following sample code. */
            int idpro = Integer.parseInt(request.getParameter("idpro"));
            
            if (session.getAttribute("cart") == null) {
                ArrayList<Order> or = new ArrayList<>();
                Product p = new DAOOrder().getProById(idpro);
                Order o = new Order();
                o.setProid(p);
                o.setQuantity(1);
                or.add(o);
                session.setAttribute("cart", or);
                
            } else {
                ArrayList<Order> or1 = (ArrayList<Order>) session.getAttribute("cart");
                int idpro1 = Integer.parseInt(request.getParameter("idpro"));
                for (Order order : or1) {
                    if (order.getProid().getProid() == idpro1) {
                        order.setQuantity(order.getQuantity() + 1);
                        session.setAttribute("cart", or1);
                        check = true;
                    }
                }
                if (!check) {
                    int idpro2 = Integer.parseInt(request.getParameter("idpro"));
                    Product p1 = new DAOOrder().getProById(idpro);
                    Order o1 = new Order();
                    o1.setProid(p1);
                    o1.setQuantity(1);
                    or1.add(o1);
                    session.setAttribute("cart", or1);
                }
            }
            check = false;
        
        response.sendRedirect("DisplayDetail");
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
