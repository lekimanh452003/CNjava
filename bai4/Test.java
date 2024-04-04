/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author fptshop
 */
public class Test {
    public static void main(String[] args) {
        Employee[] a=new Employee[3];
        System.out.println("nhap thong tin Boss: ");
        a[0]=new Boss();
        a[0].nhap();
        System.out.println("Nhap thong tin cho Piece Worker: ");
        a[1]=new PieceWorker();
        a[1].nhap();
        System.out.println("Nhap thong tin cho Commission Worker: ");
        a[2]=new CommissionWorker();
        a[2].nhap();
        System.out.println("Thong tin Boss: ");
        a[0].display();
        System.out.println("Thong tin Piece Worker: ");
        a[1].display();
        System.out.println("Thong tin Commission Worker: ");
        a[2].display();
    }
}
