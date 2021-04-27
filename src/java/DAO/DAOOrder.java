/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author my laptop
 */
public class DAOOrder extends DAOConnection{
    public Product getProById(int id){
        String sql = "select * from Product where productid = ?";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setInt(1, id);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setProid(rs.getInt(1));
                p.setProname(rs.getString(2));
                p.setProprice(rs.getFloat(4));
                p.setPronumber(rs.getInt(5));
                p.setProdes(rs.getString(6));
                p.setImage1(rs.getString(7));
                p.setImage2(rs.getString(8));
                p.setImage3(rs.getString(9));
                p.setImage4(rs.getString(10));
                return p;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
