package Bai2;

import java.util.Scanner;

public class NhanSu {
    private String ma;
    private String hoTen;
    private Date ns;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");
        ma = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        ns = new Date();
        ns.nhap();
    }

    public void xuat(){
        System.out.printf("%20s %20s %20s\n", ma, hoTen, ns.xuat());
    }
}
