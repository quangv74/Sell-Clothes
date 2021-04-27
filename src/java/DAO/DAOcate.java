/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Categories;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author my laptop
 */
public class DAOcate extends DAOConnection{
    public ArrayList<Categories> getListCateGirl(){
        String sql = "select * from Categories where cateid between 1 and 3";
        ArrayList<Categories> ca = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Categories cate = new Categories();
                cate.setCateid(rs.getInt(1));
                cate.setCatename(rs.getString(2));
                cate.setCatetotal(rs.getInt(3));
                ca.add(cate);
            }
        } catch (Exception e) {
        }
        return ca;
    }
    public ArrayList<Categories> getListCateBoy(){
        String sql = "select * from Categories where cateid between 4 and 6";
        ArrayList<Categories> ca = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Categories cate = new Categories();
                cate.setCateid(rs.getInt(1));
                cate.setCatename(rs.getString(2));
                cate.setCatetotal(rs.getInt(3));
                ca.add(cate);
            }
        } catch (Exception e) {
        }
        return ca;
    }
}
