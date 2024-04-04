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
public abstract class Employee {
    private String name;
    private float luong;
    public abstract float earnings();
    public abstract void hienthi();
    public float getLuong(){
        return luong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        name=sc.nextLine();
        earnings();
    }
    public void display(){
        System.out.println("Name: "+name);
        hienthi();
    }
}
