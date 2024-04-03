/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class QuanLy {

    private List<KhachHang> a = new ArrayList<>();
    private int n;

    public void nhap() {
        int i = 0;
        int chon;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nSTT: " + (i + 1));
            System.out.println("\nKhach hang Viet Nam(1), Khach hang nuoc ngoai(2), Thoat(3): ");
            chon = sc.nextInt();
            sc.nextLine(); // consume newline left-over
            if (chon == 1) {
                a.add(new KhachHangVietNam());
            } else if (chon == 2) {
                a.add(new KhachNuocNgoai());
            } else {
                break;
            }
            a.get(i).nhap();
            i++;
        }
        n = i;
    }

    public void xuat() {
        System.out.println("\nSo luong hoa don: " + n);
        System.out.println("\nDanh sach tat ca hoa don: ");
        for (int i = 0; i < n; i++) {
            a.get(i).xuat();
        }
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i).loai_hd() == 1) {
                d1++;
            }
            if (a.get(i).loai_hd() == 2) {
                d2++;
            }
        }
        System.out.println("\nSo luong hoa don khach Viet Nam: " + d1);
        System.out.println("\nSo luong hoa don khach nuoc ngoai: " + d2);
    }

    public double tongThanhTien() {
        double t = 0;
        for (int i = 0; i < n; i++) {
            t = t + a.get(i).thanhTien();

        }
        return t;
    }

    public void tb_tien() {
        double s1 = 0;
        int d1 = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i).loai_hd() == 2) {
                s1 = s1 + a.get(i).thanhTien();
                d1++;
            }
        }
        System.out.println("TB thanh tien cua khach nuoc ngoai: " + s1 / d1);
    }

    public void tim() {
        System.out.println("\nGiao dich cua thang 9/2013: ");
        for (int i = 0; i < n; i++) {
            if (a.get(i).get_ng()) {
                a.get(i).xuat();
            }
        }
    }

    public static void menu() {
        System.out.println("1.Nhập xuất danh sách các hóa đơn khách hàng.");
        System.out.println("2.Tính tổng số lượng điện tiêu thụ cho từng loại khách hàng");
        System.out.println("3.Tính trung bình thành tiền của khách hàng người nước ngoài");
        System.out.println("4.Xuất ra các hoá đơn trong tháng 09 năm 2013 (của 2 loại khách hàng). ");
        System.out.println("0: Thoat khoi chuong trinh");
    }

    public static void main(String[] args) {
        QuanLy q = new QuanLy();
        int control;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("\nNhap yeu cau: ");
            control = sc.nextInt();
            sc.nextLine(); // consume newline left-over
            switch (control) {
                case 1:
                    q.nhap();
                    q.xuat();
                    break;
                case 2:
                    System.out.println("Tong tien= " + q.tongThanhTien());

                    break;
                case 3:
                    q.tb_tien();
                    break;
                case 4:
                    q.tim();
                    break;
                default:
                    System.out.println("\nKet thuc.");
                    break;
            }
        } while (control >= 1 && control <= 4);
    }
}
