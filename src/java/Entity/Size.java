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
public class Size {
    private String size;
    private int soluong;
    private Product idpro;

    public Size() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Product getIdpro() {
        return idpro;
    }

    public void setIdpro(Product idpro) {
        this.idpro = idpro;
    }
    
}
