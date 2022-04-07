package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh dài là:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập độ dài cạnh ngắn là:");
        int b =Integer.parseInt(sc.nextLine());

        int P = (a + b)*2;
        System.out.println("Chu vi hình chữ nhât là" + P);
        int S = a*b;
        System.out.println("Diện tích hình chữ nhật là" + S);

        System.out.println("Tên của bạn là:");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của bạn là");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ của bạn là:");
        String address = sc.nextLine();

        System.out.println("Tên của bạn là: " + name + " Tuổi của bạn là: " + age + " Địa chỉ của bạn: " + address);



    }
}
