/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author admin
 */
public class XeNoiThanh extends ChuyenXe{
    public String Tuyen;
    public double SoKm;
    
    public XeNoiThanh(String ma, String taixe, String soxe, double doanhthu, String tuyen, double  sokm) {
        super(ma, taixe, soxe, doanhthu);
        Tuyen = tuyen;
        SoKm = sokm;
    }
    
    @Override
    public void inTT() {
        //System.out.println("Ma chuyen xe: " + Ma);
        System.out.println("tuyen: " + this.Tuyen);
        System.out.println("so km di duoc: " + this.SoKm);
    }
}
