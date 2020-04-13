/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuanLyChuyenXe {
    public ArrayList<ChuyenXe> ds = new ArrayList<>();
    
    public void them(ChuyenXe cx) {
        ds.add(cx);
    }
    
    public ArrayList<ChuyenXe> xuat() {
        return ds;
    } 
    
    public void inThongtin() {
        for(ChuyenXe cx : ds) {
            cx.inTT();
        }
    }
    
    public double tongDTNoiThanh() {
        double dt = 0;
         for(ChuyenXe cx : ds) {
            if (cx instanceof XeNoiThanh) {
                dt += cx.DoanhThu;
            }
        }
         return dt;
    }
    
    public double tongDTNgoaiThanh() {
        double dt = 0;
         for(ChuyenXe cx : ds) {
            if (cx instanceof XeNgoaiThanh) {
                dt += cx.DoanhThu;
            }
        }
         return dt;
    }
    
    public double tongDT() {
        double dt = 0;
         for(ChuyenXe cx : ds) {
                dt += cx.DoanhThu;
        }
        return dt;
        
    }
}
