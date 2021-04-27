/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Product;
import Entity.Size;
import com.sun.xml.ws.tx.at.v10.types.PrepareResponse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author my laptop
 */
public class DAOSize extends DAOConnection{
    public ArrayList<Size> getListSize(int id){
        String sql = "select * from Size where id_pro = ?";
        ArrayList<Size> size = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setInt(1, id);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Size s = new Size();
                Product p = new Product();
                p.setProid(id);
                s.setIdpro(p);
                s.setSize(rs.getString(2));
                s.setSoluong(rs.getInt(3));
                size.add(s);
            }
                    
                    
                    
        } catch (Exception e) {
        }
        return size;
    } 
}
