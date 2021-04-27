/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author my laptop
 */
public class Order {
    private int idorder;
    private Product proid;
    private AccountUser userid;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private int total;

    public Order() {
    }

    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    public Product getProid() {
        return proid;
    }

    public void setProid(Product proid) {
        this.proid = proid;
    }

    public AccountUser getUserid() {
        return userid;
    }

    public void setUserid(AccountUser userid) {
        this.userid = userid;
    }

   

    

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
