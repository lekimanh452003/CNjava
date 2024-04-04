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
public class ManagerStudent extends Student {

    int n;
    Student[] student;

    public ManagerStudent(String name, int age, String nativePlace,
            String id, int n) {
        super(name, age, nativePlace, id);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public ManagerStudent() {
        super();
        student=null;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so hoc sinh");
        n = Integer.parseInt(sc.nextLine());
        student = new Student[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Student();
            student[i].input();

        }
    }

    @Override
    public void display() {
        for (int i = 0; i < n; i++) {
            student[i].display();
        }
    }
}
