package Bai1;

import java.util.Scanner;

public class SanPham {
    protected Integer maSP;
    protected String tenSP;
    protected String tenHSX;
    protected String ngayNhap;

    public SanPham() {}

    public SanPham(Integer maSP, String tenSP, String tenHSX, String ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenHSX = tenHSX;
        this.ngayNhap = ngayNhap;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        this.maSP = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSP = sc.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        this.tenHSX = sc.nextLine();
        System.out.print("Nhập ngày nhập: ");
        this.ngayNhap = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-15d %-20s %-20s %-20s ", maSP, tenSP, tenHSX, ngayNhap);
    }


    public Integer getMaSP() {
        return maSP;
    }

    public void setMaSP(Integer maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenHSX() {
        return tenHSX;
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", tenHSX='" + tenHSX + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
}
