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
public class KhachHangVietNam extends KhachHang {

    String loaiKH;
    int dinhmuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String loaiKH, int dinhmuc) {
        this.loaiKH = loaiKH;
        this.dinhmuc = dinhmuc;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public DateTime getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(DateTime ngayHD) {
        this.ngayHD = ngayHD;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): ");
        this.loaiKH = sc.nextLine();

        System.out.println("Nhập định mức: ");
        this.dinhmuc = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        super.xuat();
        System.out.println("ối tượng khách hàng: " + getLoaiKH());
    }

    public int loai_hd() {
        return 1;
    }
//    public boolean get_ng() {
//        if (ngayHD.ngay == 9 && ngayHD.nam == 2013) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    @Override
    public double thanhTien() {
        if (getSoLuong() <= getDinhmuc()) {
            return getSoLuong() * getDongia();
        } else {
            return getSoLuong() * getDongia() * getDinhmuc() + (getSoLuong() - getDinhmuc()) * getDongia() * 2.5;
        }
    }

}
