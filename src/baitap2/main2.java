/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author admin
 */
public class main2 {
    public static void main(String[] args) {
        
        //Khoi tao danh sach nhan vien
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        //Khoi tao 5 nhan vien
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Dinh Tan Phuc");
        nv1.setTuoi(21);
        nv1.setDiaChi("Khanh Hoa");
        nv1.setTienLuong(422000);
        nv1.setTongSoGioLam(50);
        
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Dinh Tan Phuc");
        nv2.setTuoi(21);
        nv2.setDiaChi("Khanh Hoa");
        nv2.setTienLuong(422000);
        nv2.setTongSoGioLam(50);
        
        NhanVien nv3 = new NhanVien();
        nv3.setTen("Dinh Tan Phuc");
        nv3.setTuoi(21);
        nv3.setDiaChi("Khanh Hoa");
        nv3.setTienLuong(422000);
        nv3.setTongSoGioLam(50);
        
        NhanVien nv4 = new NhanVien();
        nv4.setTen("Dinh Tan Phuc");
        nv4.setTuoi(21);
        nv4.setDiaChi("Khanh Hoa");
        nv4.setTienLuong(422000);
        nv4.setTongSoGioLam(50);
        
        NhanVien nv5 = new NhanVien();
        nv5.setTen("Dinh Tan Phuc");
        nv5.setTuoi(21);
        nv5.setDiaChi("Khanh Hoa");
        nv5.setTienLuong(422000);
        nv5.setTongSoGioLam(50);

        
        // Them 5 nhan vien vao danh sach
        QLNV.them(nv1);
        QLNV.them(nv2);
        QLNV.them(nv3);
        QLNV.them(nv4);
        QLNV.them(nv5);
        
        // In danh sach nhan vien ra man hinh
        QLNV.inDS();
    }
}
