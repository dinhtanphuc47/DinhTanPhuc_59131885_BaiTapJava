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
public class SinhVienBiz extends SinhVienPoly {
    // attributes
    public double diemMarketing,diemSales;
    // constructor
    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
      super(hoTen, nganh);
      
      this.diemMarketing = diemMarketing;
      this.diemSales = diemSales;
    }

    // defined abstract method
    @Override
    public double getDiem() {
      return (2 * this.diemMarketing + this.diemSales) / 3;
    };
}
