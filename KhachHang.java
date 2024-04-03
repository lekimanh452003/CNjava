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
abstract public class KhachHang {

    protected String maKH;
    protected String hotenKH;
    protected int soLuong;
    protected double dongia;
    protected double thanhtien;
    DateTime ngayHD;

    public KhachHang() {
        this.ngayHD = new DateTime();
    }

    public KhachHang(String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, DateTime ngayHD) {
        this.maKH = maKH;
        this.hotenKH = hotenKH;
        this.soLuong = soLuong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;

        this.ngayHD = ngayHD;
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

    public double getThanhtien() {
        return thanhtien;
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

    public abstract double thanhTien();

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã khách hàng: ");
        this.maKH = sc.nextLine();

        System.out.println("Nhập họ tên: ");
        this.hotenKH = sc.nextLine();

        System.out.println("Nhập ngày ra hóa đơn: ");
        this.ngayHD.ngay = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tháng ra hóa đơn: ");
        this.ngayHD.thang = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập năm ra hóa đơn: ");
        this.ngayHD.nam = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số lượng: ");
        this.soLuong = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập đơn giá: ");
        this.dongia = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Mã khách hàng: " + this.maKH);
        System.out.println("Họ tên: " + this.hotenKH);
        System.out.println("Ngày ra hóa đơn: " + this.ngayHD.getNgay() + "/" + this.ngayHD.getThang() + "/" + ngayHD.getNam());
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Đơn giá: " + this.dongia);
    }

    int loai_hd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean get_ng() {

        if (ngayHD.ngay == 9 && ngayHD.nam == 2013) {
            return true;
        } else {
            return false;
        }

    }

}
