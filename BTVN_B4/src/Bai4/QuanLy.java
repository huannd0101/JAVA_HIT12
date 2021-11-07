package Bai4;

import java.util.Scanner;

public class QuanLy {
    private String ma;
    private String hoTen;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        ma = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Mã quản lý: " + ma);
        System.out.println("Họ tên quản lý: " + hoTen);
    }
}
