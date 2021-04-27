/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevlet;

import DAO.DAOAccount;
import Entity.AccountUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author my laptop
 */
public class Account extends HttpServlet {

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
            out.println("<title>Servlet Account</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Account at " + request.getContextPath() + "</h1>");
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
//        HttpSession session = request.getSession(true);
//        AccountUser a = (AccountUser) session.getAttribute("account");
//        int id = a.getIduser();
//        response.getWriter().print(id);
        DAOAccount ac = new DAOAccount();
        request.setAttribute("state", ac.getListState());
        request.setAttribute("country", ac.getListCountry());
        request.getRequestDispatcher("customer-account.jsp").forward(request, response);
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
        HttpSession session = request.getSession(true);
        AccountUser a = (AccountUser) session.getAttribute("account");
//        response.getWriter().print(a.getIduser());
        String firstname = request.getParameter("firstname1");
        String lastname = request.getParameter("lastname1");
        String company = request.getParameter("company1");
        String street = request.getParameter("street1");
        Date date = Date.valueOf(request.getParameter("date1"));
        String gender = request.getParameter("gender1");
        String city = request.getParameter("city");
        String country = request.getParameter("country1");
        int phone = Integer.parseInt(request.getParameter("phone1"));
        String email = request.getParameter("email1");
        int id = a.getIduser();
////        
        
        DAOAccount ac = new DAOAccount();
////        String city,String fname,String lastname,String company,String country,int phone,String email,Date dob,String gender,String street,int id
        int n = ac.updateAccount(city, firstname, lastname, company, country, phone, email, date, gender, street, id);
//        response.getWriter().print(n);
           if (n > 0) {
            request.getRequestDispatcher("customer-account1.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("customer-account2.jsp").forward(request, response);
        }
//         
//
//        response.getWriter().println(firstname+" "+lastname+" "+company+" "+street+" "+date+" "+gender+" "+city+" "+country+" "+phone+" "+email);

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
