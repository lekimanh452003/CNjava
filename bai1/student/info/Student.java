/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.student.info;

import bai1.Person.info.Person;
import java.util.Scanner;

/**
 *
 * @author fptshop
 */
public class Student implements Person {

    private String name;
    private int Age;
    private String nativePlace;
    private String id;

    public Student() {
        super();
    }

    public Student(String name, int age, String nativePlace, String id) {
        super();
        this.name = name;
        Age = age;
        this.nativePlace = nativePlace;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Name");
        name = sc.nextLine();
        System.out.println("Nhap vao tuoi");
        Age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao native place ");
        nativePlace = sc.nextLine();
        System.out.println("Nhap vao id ");
        id = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Ten :" + name);
        System.out.println("Tuoi :" + Age);
        System.out.println("NativePlace :" + nativePlace);
        System.out.println("Id :" + id);
    }

}
