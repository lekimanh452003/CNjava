/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2.xeco.info;

import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class XeMay implements IXe {

    private String bienso;
    private String loaixe;
    private String mauxe;
    private float giatien;

    public XeMay() {
    }

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập biển số xe: ");
        bienso = sc.nextLine();
        System.out.print("Nhập loại xe: ");
        loaixe = sc.nextLine();
        System.out.print("Nhập màu xe: ");
        mauxe = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        giatien = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void hienthi() {
        System.out.println("Thông tin xe máy:");
        System.out.println("Biển số: " + bienso);
        System.out.println("Loại xe: " + loaixe);
        System.out.println("Màu xe: " + mauxe);
        System.out.println("Giá tiền: $" + giatien);
    }

}
