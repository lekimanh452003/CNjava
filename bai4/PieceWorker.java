/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class PieceWorker extends Employee {
    float soluongsanpham;
    float luong;
    @Override
    public float earnings() {
    Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so lung san pham: ");
        soluongsanpham=Float.parseFloat(sc.nextLine());
        return luong=(float)(soluongsanpham*0.5);
    }

    @Override
    public void hienthi() {
        System.out.println("luong: "+luong);
    }
    
}
