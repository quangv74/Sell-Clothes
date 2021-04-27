/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.AccountUser;
import Entity.Country;
import Entity.State;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author my laptop
 */
public class DAOAccount extends DAOConnection {

    public ArrayList<State> getListState() {
        String sql = "select * from State";
        ArrayList<State> st = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while (rs.next()) {
                State s = new State();
                s.setIdstate(rs.getInt(1));
                s.setStatename(rs.getString(2));
                st.add(s);
            }
        } catch (Exception e) {
        }
        return st;
    }

    public ArrayList<Country> getListCountry() {
        String sql = "select * from Country";
        ArrayList<Country> co = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while (rs.next()) {
                Country c = new Country();
                c.setCountryid(rs.getInt(1));
                c.setCountryname(rs.getString(2));
                co.add(c);
            }
        } catch (Exception e) {
        }
        return co;
    }

    public int insertUser(String username, String pass, String name) {
        String sql = "insert into [User](username,password,lastname) values(?,?,?)";
        int n = 0;
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, username);
            state.setString(2, pass);
            state.setString(3, name);

            n = state.executeUpdate();

        } catch (Exception e) {
        }
        return n;
    }

    public AccountUser getAccount(String username, String pass, String name) {
        String sql = "select iduser from [User] where username=? and password=? and lastname= ?";
        AccountUser ac = new AccountUser();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, username);
            state.setString(2, pass);
            state.setString(3, name);
            ResultSet rs = state.executeQuery();
            while (rs.next()) {
                ac.setIduser(rs.getInt(1));
                ac.setUsername(username);
                ac.setPassword(pass);
                ac.setLastname(name);
            }
        } catch (Exception e) {
        }
        return ac;
    }

    public int updateAccount(String city, String fname, String lastname, String company, String country, int phone, String email, Date dob, String gender, String street, int id) {
        String sql = "update [User] set city=?,firstname=?,lastname=?,company=?,country=?,telephone = ?,\n"
                + "email=?,dob=?,gender=?,street=? where iduser = ?";
        int n = 0;
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, city);
            state.setString(2, fname);
            state.setString(3, lastname);
            state.setString(4, company);
            state.setString(5, country);
            state.setInt(6, phone);
            state.setString(7, email);
            state.setDate(8, dob);
            state.setString(9, gender);
            state.setString(10, street);
            state.setInt(11, id);
            n = state.executeUpdate();
        } catch (Exception e) {
        }
        return n;
    }
    public ArrayList<AccountUser> getListUser(){
        String sql = "select * from [User]";
        ArrayList<AccountUser> ac = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                AccountUser a = new AccountUser();
                a.setIduser(rs.getInt(1));
                a.setUsername(rs.getString(2));
                a.setPassword(rs.getString(3));
                a.setFirstname(rs.getString(4));
                a.setLastname(rs.getString(5));
                a.setCompany(rs.getString(6));
                a.setCity(rs.getString(7));
                a.setCountry(rs.getString(8));
                a.setPhone(rs.getInt(9));
                a.setEmail(rs.getString(10));
                a.setDate(rs.getDate(11));
                a.setGender(rs.getString(12));
                a.setStreet(rs.getString(13));
                ac.add(a);
            }
        } catch (Exception e) {
        }
        return ac;
    }
    public boolean checkUser(String user,String password){
        String sql = "select * from [User] where username =? and password=?";
        
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, user);
            state.setString(2, password);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public int changePass(String password,int id){
        String sql ="update [User] set password = ? where iduser = ?";
        int n=0;
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1,password);
            state.setInt(2, id);
            n = state.executeUpdate();
        } catch (Exception e) {
        }
        return n;
    }
    public AccountUser getId(String username,String password){
        String sql = "select iduser from [User] where username =? and password=?";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1,username);
            state.setString(2,password);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                AccountUser user = new AccountUser();
                user.setIduser(rs.getInt(1));
                return user;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAOAccount ac = new DAOAccount();

//        String date = "2000-06-15";
//        Date date1 = Date.valueOf(date);
//        int n = ac.updateAccount("HCM", "nguyễn", "nam", "yamaha", "việt nam", 023456, "hn@fpt.edu.vn", date1, "nam", "nguyễn xiển", 10);
//        if (n > 0) {
//            System.out.println("ok");
//        } else {
//            System.out.println("not ok");
//        }
//        ArrayList<AccountUser> b = ac.getListUser();
//        for (AccountUser accountUser : b) {
//            System.out.println(accountUser);
//        }
       AccountUser a = ac.getId("battle","123");
        System.out.println(a.getIduser());
    }
}
