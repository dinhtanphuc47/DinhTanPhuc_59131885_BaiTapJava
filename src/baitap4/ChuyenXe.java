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
public abstract class ChuyenXe {
    public String Ma;
    public String TaiXe;
    public String SoXe;
    public double DoanhThu;
    
    public ChuyenXe(String ma, String taixe, String soxe, double doanhthu) {
        Ma = ma;
        TaiXe = taixe;
        SoXe = soxe;
        DoanhThu = doanhthu;
    }
    
    public abstract void inTT();
}
