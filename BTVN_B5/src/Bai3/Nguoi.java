package Bai3;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public Nguoi() {}

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        this.queQuan = sc.nextLine();
    }
    public void xuat() {
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
