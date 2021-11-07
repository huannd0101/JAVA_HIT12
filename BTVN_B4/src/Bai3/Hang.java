package Bai3;

import java.util.Scanner;

public class Hang {
    private String ma;
    private String ten;
    private float donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        ma = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        ten = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextFloat();
        sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%20s %20s %20s\n", ma, ten, donGia);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
}
