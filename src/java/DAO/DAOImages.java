/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author my laptop
 */
public class DAOImages extends DAOConnection {

    public ArrayList<Product> getListPro(int id) {
        String sql = "select p.productid,p.pro_name,p.pro_price,p.pro_number,p.pro_desciption,p.Image1,p.Image2,p.Image3,p.Image4 "
                + "from Categories c inner join Product p on c.cateid = p.pro_category_id "
                + "where c.cateid = " + id + "";
        ArrayList<Product> p = new ArrayList<>();

        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProid(rs.getInt(1));
                pro.setProname(rs.getString(2));
                pro.setProprice(rs.getInt(3));
                pro.setPronumber(rs.getInt(4));
                pro.setProdes(rs.getString(5));
                pro.setImage1(rs.getString(6));
                pro.setImage2(rs.getString(7));
                pro.setImage3(rs.getString(8));
                pro.setImage4(rs.getString(9));
                
                p.add(pro);
            }
        } catch (Exception e) {
        }
        return p;
    }
    public Product getPro1(int id,int id1) {
        String sql = "select p.productid,p.pro_name,p.pro_price,p.pro_number,p.pro_desciption,p.Image1,p.Image2,p.Image3,p.Image4 "
                + "from Categories c inner join Product p on c.cateid = p.pro_category_id "
                + "where c.cateid = " + id + " and p.productid = "+id1+"";
       

        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProid(rs.getInt(1));
                pro.setProname(rs.getString(2));
                pro.setProprice(rs.getInt(3));
                pro.setPronumber(rs.getInt(4));
                pro.setProdes(rs.getString(5));
                pro.setImage1(rs.getString(6));
                pro.setImage2(rs.getString(7));
                pro.setImage3(rs.getString(8));
                pro.setImage4(rs.getString(9));
                return pro;
            }
        } catch (Exception e) {
        }
        return null;
    }
    public static void main(String[] args) {
//        DAOImages i = new DAOImages();
//        ArrayList<Product> p = i.getListPro1(2,25);
//        for (Product product : p) {
//            System.out.println(product.getImage1());
        }
    }

