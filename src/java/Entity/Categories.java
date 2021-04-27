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
public class Categories {

    private int cateid;
    private String catename;
    private int catetotal;
    private int total;

    public Categories() {
    }

    public Categories(int cateid) {
        this.cateid = cateid;

    }

    public Categories(int cateid, String catename, int catetotal) {
        this.cateid = cateid;
        this.catename = catename;
        this.catetotal = catetotal;
    }

    public int getTotal() {
        return total += catetotal;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public int getCatetotal() {
        return catetotal;
    }

    public void setCatetotal(int catetotal) {
        this.catetotal = catetotal;
    }

}
