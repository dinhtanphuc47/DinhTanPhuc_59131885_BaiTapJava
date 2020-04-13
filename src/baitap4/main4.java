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
public class main4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        //them thong tin xe noi thanh
        XeNoiThanh nt1 = new XeNoiThanh("1", "A", "76A12345", 200000, "QN-NT", 5);
        XeNoiThanh nt2 = new XeNoiThanh("2", "B", "76A12311", 300000, "QN-SG", 6);
        XeNoiThanh nt3 = new XeNoiThanh("3", "C", "76A12000", 400000, "QN-PY", 7);
        
        qlcx.them(nt1);
        qlcx.them(nt2);
        qlcx.them(nt3);
        
        //them thong tin xe ngoai thanh
        XeNgoaiThanh ngt1 = new XeNgoaiThanh("4", "D", "76A12125", 500000, "QN-CR", 8);
        XeNgoaiThanh ngt2 = new XeNgoaiThanh("5", "E", "76A12385", 600000, "QN-CB", 9);
        XeNgoaiThanh ngt3 = new XeNgoaiThanh("6", "F", "76A12328", 700000, "QN-TP", 10);
        //them vao quan ly chuyen xe
        qlcx.them(ngt1);
        qlcx.them(ngt2);
        qlcx.them(ngt3);
        //in thoong tin cac chuyen xe
        qlcx.inThongtin();
        //danh thu xe ngoai thanh
        System.out.println("Tong doanh thu ngoai thanh: " + qlcx.tongDTNgoaiThanh());
        //danh thu xe ngoai thanh
        System.out.println("Tong doanh thu noi thanh: " + qlcx.tongDTNoiThanh());
        //toong doanh thu
        System.out.println("Tong doanh: " + qlcx.tongDT());
    }
}
