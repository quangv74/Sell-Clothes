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
public class Product {
    private int proid;
    private String proname;
    private Categories procateid;
    private float proprice;
    private int pronumber;

    public int getPronumber() {
        return pronumber;
    }

    public void setPronumber(int pronumber) {
        this.pronumber = pronumber;
    }
    private String prodes;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    

    public Product() {
    }

    
    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Categories getProcateid() {
        return procateid;
    }

    public void setProcateid(Categories procateid) {
        this.procateid = procateid;
    }

    public float getProprice() {
        return proprice;
    }

    public void setProprice(float proprice) {
        this.proprice = proprice;
    }

   

    public String getProdes() {
        return prodes;
    }

    public void setProdes(String prodes) {
        this.prodes = prodes;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    @Override
    public String toString() {
        return "Product{" + "proid=" + proid + ", proname=" + proname + ", procateid=" + procateid + ", proprice=" + proprice + ", pronumber=" + pronumber + ", prodes=" + prodes + '}';
    }
    
}
