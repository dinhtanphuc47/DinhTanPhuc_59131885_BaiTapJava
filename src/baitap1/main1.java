/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author admin
 */
public class main1 {
       public static void main(String[] args)
    {
        NhanVien NV = new NhanVien();
        
        // khởi tạo 3 nhân viên
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Dinh Tan Phuc");
        nv1.setTuoi(21);
        nv1.setDiaChi("Khanh Hoa");
        nv1.setTienLuong(422000);
        nv1.setTongSoGioLam(50);
        nv1.getThongTin();
        System.out.println("Tien thuong: " + nv1.tinhThuong());
        
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Ngo Ba Kha");
        nv2.setTuoi(35);
        nv2.setDiaChi("Dong Nai");
        nv2.setTienLuong(122000);
        nv2.setTongSoGioLam(40);
        nv2.getThongTin();
        System.out.println("Tien thuong: " + nv2.tinhThuong());
        
        NhanVien nv3 = new NhanVien();
        nv3.setTen("Bui Xuan Huan");
        nv3.setTuoi(45);
        nv3.setDiaChi("Bac Ninh");
        nv3.setTienLuong(200000);
        nv3.setTongSoGioLam(30);
        nv3.getThongTin();
        System.out.println("Tien thuong: " + nv3.tinhThuong());

    }
} 

