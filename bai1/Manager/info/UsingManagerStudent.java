/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.Manager.info;

import bai1.student.info.Student;
import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class UsingManagerStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        ManagerStudent mn = new ManagerStudent();
        do {
            System.out.println("1 input data");
            System.out.println("2 display data");
            System.out.println("3 sort by name");
            System.out.println("4 search by name");
            System.out.println("5 exit");
            System.out.println("Nhap lua chon cua ban: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    mn.input();
                    break;
                case 2:
                    mn.display();
                    break;
                case 3:
                    if (mn.student == null) {
                        System.out.println("ban chua nhap du lieu");

                    } else {
                        for (int i = 0; i < mn.getStudent().length - 1; i++) {
                            for (int j = i + 1; j < mn.getStudent().length; j++) {
                                if (mn.getStudent()[i].getName().compareTo(mn.getStudent()[j].getName()) > 0) {
                                    Student tg =  mn.getStudent()[i];
                                    mn.getStudent()[i] = mn.getStudent()[j];
                                    mn.getStudent()[j] = tg;

                                }
                            }
                        }
                        mn.display();
                    }
                case 4:
                    if(mn==null){
                        System.out.println("ban chua nhap du lieu");
                    }else{
                        String diachi;
                        System.out.println("Nhap ten ban muon tim: ");
                        diachi=sc.nextLine();
                        System.out.println("Thong tin sinh vien can tim la: ");
                        int dem=0;
                        for(int i=0;i<mn.getStudent().length;i++){
                            if(mn.getStudent()[i].getName().equals(diachi)){
                                mn.getStudent()[i].display();
                                dem++;
                            }
                        }
                        if(dem==0){
                            System.out.println("Khong co dia chi ban muon tim.");
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (n != 5);
    }
}
