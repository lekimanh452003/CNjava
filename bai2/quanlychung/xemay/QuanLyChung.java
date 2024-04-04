/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2.quanlychung.xemay;

import bai2.hanoi.xemay.XeMayHaNoi;
import bai2.hoabinh.xemay.XeMayHoaBinh;
import bai2.xeco.info.XeMay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class QuanLyChung {

    private static XeMayHaNoi xmhn= new XeMayHaNoi();
    private static XeMayHoaBinh xmhb=new XeMayHoaBinh();
    
    public static void sapXepTheoBienSoHoaBinh() {
        if (xmhb != null) {
            Arrays.sort(xmhb.getMangxe(), new Comparator<XeMay>() {
                @Override
                public int compare(XeMay o1, XeMay o2) {
                    return o1.getBienso().compareTo(o2.getBienso());
                }
            });
            System.out.println("Đã sắp xếp danh sách theo biển số xe!");
        } else {
            System.out.println("Chưa có danh sách xe máy tại tỉnh Hòa Binh");
        }
    }

    public static void sapXepTheoBienSoHaNoi() {
        if (xmhn != null) {
            Arrays.sort(xmhn.getMangxe2(), new Comparator<XeMay>() {
                @Override
                public int compare(XeMay o1, XeMay o2) {
                    return o1.getBienso().compareTo(o2.getBienso());
                }
            });
            System.out.println("Đã sắp xếp danh sách theo biển số xe!");
        } else {
            System.out.println("Chưa có danh sách xe máy tại tỉnh Ha Noi");
        }
    }

    public static void timKiemXeTheoBienSoHoaBinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe cần tìm: ");
        String bienSoTim = sc.nextLine();
        if (xmhb != null) {
            boolean tim = false;
            for (XeMay xe : xmhb.getMangxe()) {
                if (xe.getBienso().equalsIgnoreCase(bienSoTim)) {
                    System.out.println("-> Thông tin xe máy cần tìm: ");
                    xe.hienthi();
                    tim = true;
                    break;
                }
            }
        }
    }

    public static void timKiemXeTheoBienSoHaNoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe cần tìm: ");
        String bienSoTim = sc.nextLine();
        if (xmhn != null) {
            boolean tim = false;
            for (XeMay xe : xmhn.getMangxe2()) {
                if (xe.getBienso().equalsIgnoreCase(bienSoTim)) {
                    System.out.println("-> Thông tin xe máy cần tìm: ");
                    xe.hienthi();
                    tim = true;
                    break;
                }
            }
            if (!tim) {
                System.out.println("Không tìm thấy xe với biển số: " + bienSoTim);
            }
        } else {
            System.out.println("Chưa có danh sách xe máy tại tỉnh Ha Noi");

        }
    }

    public static void ThongKeSoLuongXe() {
        if (xmhb != null || xmhn != null) {
            System.out.println("So luong xe đang quản lý là: " + (xmhb.getN() + xmhn.getN()));
        } else {
            System.out.println("Chua co danh sach xe may!!");
        }
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hòa Bình.");
        System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Thống kê số lượng xe đang quản lý.");
        System.out.println("6. Thoát");
    }

    public static void main(String[] args) {

        int n = 0;
       
        Scanner sc = new Scanner(System.in);
        int choice, chon;
        do {
            menu();
            System.out.println("Nhap lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    xmhb.nhap();
                    break;
                case 2:
                    xmhn.nhap();
                    break;
                case 3:
                    System.out.println("Chọn tỉnh: 1. Hòa Bình; 2. Hà Nội: ");
                    chon = Integer.parseInt(sc.nextLine());
                    if (chon == 1) {
                        sapXepTheoBienSoHoaBinh();
                        System.out.println("->Danh sách xe sau sắp xếp tăng dần: ");
                        xmhb.hienthi();
                    } else {
                        sapXepTheoBienSoHaNoi();
                        System.out.println("->Danh sách xe sau sắp xếp tăng dần: ");
                        xmhn.hienthi();
                    }
                    break;
                case 4:
                    System.out.println("Chọn tỉnh: 1. Hòa Bình; 2. Hà Nội: ");
                    chon = Integer.parseInt(sc.nextLine());
                    if (chon == 1) {
                        timKiemXeTheoBienSoHoaBinh();
                    } else {
                        timKiemXeTheoBienSoHaNoi();
                    }
                    break;
                case 5:
                    ThongKeSoLuongXe();
                    break;
                default:
                    System.out.println("Ban chon thoat khoi chuong trinh: ");
                    break;
            }
        } while (n != 6);
    }
}
