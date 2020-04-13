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
public class XeNgoaiThanh extends ChuyenXe{
    public String NoiDen;
    public double SoNgay;
    
    public XeNgoaiThanh(String ma, String taixe, String soxe, double doanhthu, String noiden, double  dongay) {
        super(ma, taixe, soxe, doanhthu);
        NoiDen = noiden;
        SoNgay = dongay;
    }
    
     @Override
    public void inTT() {
        System.out.println("Ma chuyen xe: " + Ma);
        System.out.println("noi den: " + this.NoiDen);
        System.out.println("so ngay: " + this.SoNgay);
}
