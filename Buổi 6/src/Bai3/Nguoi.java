package Bai3;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen, ngaySinh, queQuan;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
    }
    public void xuat() {
        //%d: so nguyen
        //%f: so thuc
        //%c: ky tu
        //%s: chuoi
        System.out.printf("%-20s %-20s %-20s", hoTen, ngaySinh, queQuan);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
