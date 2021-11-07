package Bai2;

import java.util.Scanner;

public class Date {
    private int d;
    private int m;
    private int y;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        d = sc.nextInt();
        System.out.print("Nhập tháng: ");
        m = sc.nextInt();
        System.out.print("Nhập năm: ");
        y = sc.nextInt();
    }

    public String xuat(){
        return d + "/" + m + "/" + y;
    }
}
