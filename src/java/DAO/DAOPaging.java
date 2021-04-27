/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author my laptop
 */
public class DAOPaging extends DAOConnection {

    public ArrayList<Product> getPro(int pageindex, int pagesize, int cateid) {
        ArrayList<Product> pro = new ArrayList<>();
        try {
            String sql = "SELECT productid,pro_name,pro_price,pro_number,pro_desciption,Image1,Image2,Image3,Image4 \n"
                    + "FROM (SELECT ROW_NUMBER() OVER (ORDER BY productid ASC) as row_num,p.productid,p.pro_name,p.pro_price,p.pro_number,p.pro_desciption,p.Image1,p.Image2,p.Image3,p.Image4\n"
                    + "from Categories c inner join Product p on c.cateid = p.pro_category_id where c.cateid = ?) tbl\n"
                    + "WHERE row_num >= ? * (? - 1) + 1 AND row_num <= ? * ?";
            PreparedStatement state = con.prepareStatement(sql);
            state.setInt(1, cateid);
            state.setInt(2, pagesize);
            state.setInt(3, pageindex);
            state.setInt(4, pagesize);
            state.setInt(5, pageindex);
            
            ResultSet rs = state.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProid(rs.getInt(1));
                p.setProname(rs.getString(2));
                p.setProprice(rs.getInt(3));
                p.setPronumber(rs.getInt(4));
                p.setProdes(rs.getString(5));
                p.setImage1(rs.getString(6));
                p.setImage2(rs.getString(7));
                p.setImage3(rs.getString(8));
                p.setImage4(rs.getString(9));
                pro.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPaging.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }

    public int countPro(int id) {

        try {
            String sql = "SELECT COUNT(*) as total FROM Product where pro_category_id = ?";
            PreparedStatement state = con.prepareStatement(sql);
            state.setInt(1, id);
            ResultSet rs = state.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPaging.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static void main(String[] args) {
        DAOPaging a = new DAOPaging();
        ArrayList<Product> p = a.getPro(2, 3, 1);
        for (Product product : p) {
            System.out.println(product);
        }
        int b = a.countPro(1);
        System.out.println(b);
    }
}
