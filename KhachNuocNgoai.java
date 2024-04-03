/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_6;

import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class KhachNuocNgoai extends KhachHang {

    private String quoctich;

    public KhachNuocNgoai() {
    }

    public KhachNuocNgoai(String quoctich, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, DateTime ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public int loai_hd() {
        return 2;
    }

//    public boolean get_ng() {
//        if (ngayHD.ngay == 9 && ngayHD.nam == 2013) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập quốc tịch: ");
        this.quoctich = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Quốc tịch: " + getQuoctich());
    }

    @Override
    public double thanhTien() {
        return getSoLuong() * getDongia();
    }

}
