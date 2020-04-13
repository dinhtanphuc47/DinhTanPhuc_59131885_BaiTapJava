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
public class NhanVien {
  private String Ten;
  private int Tuoi;
  private String DiaChi;
  private double TienLuong;
  private int TongSoGioLam;

  public NhanVien() {
    Ten = "";
    Tuoi = 0;
    DiaChi = "";
    TienLuong = 0;
    TongSoGioLam = 0;
  }
    public void setTen(String ten) {
        Ten = ten;
    }
    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public void setDiaChi(String diachi) {
        DiaChi = diachi;
    }
    public void setTienLuong(double luong) {
        TienLuong = luong;
    }
    public void setTongSoGioLam(int giolam) {
        TongSoGioLam = giolam;
    }
   public void getThongTin() {
        System.out.println("Ten: " + Ten);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println("Tien luong: " + (int)TienLuong);
        System.out.println("Tong so gio lam: " + TongSoGioLam + "\n");
        //return 
    }
    
    public double tinhThuong() {
        if (TongSoGioLam < 100) return 0;
        else if (TongSoGioLam >= 100 && TongSoGioLam < 200) return TienLuong * 0.1;
        return TienLuong * 0.2;
   }
}
