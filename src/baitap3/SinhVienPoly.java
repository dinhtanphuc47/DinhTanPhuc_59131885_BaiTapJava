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
public abstract class SinhVienPoly 
{
    private final String hoTen;
    private final String nganh;
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();

    // cho biet hoc luc bang phuong phap truu tuong
    public String getHocLuc() {
      if (this.getDiem() < 5) {
        return "Yeu";
      }
      if (getDiem() >= 5 && getDiem() < 6.5) {
        return "Trung binh";
      }
      if (getDiem() >= 6.5 && getDiem() < 7.5) {
        return "Kha";
      }
      if (getDiem() >= 7.5 && getDiem() < 9) {
        return "Gioi";
      }
      return "Xuat sac";
    }

     // xuat thong tin sinh vien
     public void xuat() {
       System.out.println("Ho ten: " + this.hoTen + ", nganh hoc: " + this.nganh);
     }
}
   
