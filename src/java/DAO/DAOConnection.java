/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author my laptop
 */
public class DAOConnection {

    protected Connection con;
    public DAOConnection(){
        String databaseName = "WebShop" ; 
        String userName = "sa" ; 
        String passWord = "123456" ; 
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + databaseName+"" ; 
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver") ;
            con = DriverManager.getConnection(url , userName , passWord) ; 
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOConnection.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public static void main(String[] args) {
        new DAOConnection();
    }
}
