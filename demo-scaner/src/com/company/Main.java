package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        tao doi tuong scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban:");
        String name = sc.nextLine();

        System.out.println("Ten sau khi nhap:" + name);
//
//        System.out.println("Nhap tuoi cua ban:");
//        int age = Scanner.nextInt();
//        System.out.println("Tuoi sau khi nhap:" +age);
//        System.out.println("nhap diem");
//        double point = Scanner.nextDouble();
//        System.out.println("Diem:" + point);
//        Scanner.nextLine();
//
//        System.out.println("Nhap dia chi:");
//        String address = Scanner.nextLine();
//        System.out.println("Dia chi:" + address);

        String name = "Hoa";
        int age = 30;
        String address = "HG";
        System.out.println(" Xin Chao cac ban" + name + "Nam nay toi " + age + "toi den tu" + address);





    }
}
