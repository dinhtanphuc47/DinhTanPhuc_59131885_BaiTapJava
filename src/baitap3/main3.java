/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author admin
 */
public class main3 {
    public static void main(String[] args) {
        //tao 3 sinh vien
        SinhVienIT IT = new SinhVienIT("Dinh Tan Phuc", "CNTT", 10, 10, 10);
        SinhVienBiz BIZ = new SinhVienBiz("Ngo Ba Kha", "Biz", 4, 7);
        SinhVienPoly POLY = new SinhVienIT("Bui Xuan Huan", "CNTT", 8, 5, 9);
        
        // xuat thong tin sinh vien
        IT.xuat();
        System.out.println("diem: " + IT.getDiem());
        System.out.println("hoc luc: " + IT.getHocLuc());
        
        BIZ.xuat();
        System.out.println("diem: " + BIZ.getDiem());
        System.out.println("hoc luc: " + BIZ.getHocLuc());
        
        POLY.xuat();
        System.out.println("diem: " + POLY.getDiem());
        System.out.println("hoc luc: " + POLY.getHocLuc());
    }
}