/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2.hanoi.xemay;

import bai2.xeco.info.XeMay;
import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class XeMayHaNoi extends XeMay {

    private int n;
    XeMay[] mangxe2;

    public XeMayHaNoi(String bienso, String loaixe, String mauxe, float giatien, int n, XeMay[] mangxe) {
        super(bienso, loaixe, mauxe, giatien);
        this.n = n;
        this.mangxe2 = mangxe2;
    }

    public XeMayHaNoi() {
        super();
        mangxe2=null;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public XeMay[] getMangxe2() {
        return mangxe2;
    }

    public void setMangxe(XeMay[] mangxe2) {
        this.mangxe2 = mangxe2;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng xe máy ở Hà Nội:");
        n = Integer.parseInt(sc.nextLine());
        mangxe2 = new XeMay[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin xe máy thứ " + (i + 1) + ":");
            mangxe2[i] = new XeMay();
            mangxe2[i].nhap();
        }
    }

    @Override
    public void hienthi() {
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin xe máy thứ " + (i + 1) + ":");
            mangxe2[i].hienthi();
        }
    }
}
