package Bai2;

import java.util.Scanner;

public class SanPham {
    private int maSP;
    private String tenSP;
    private int soLuong;
    private int donGia;

    public SanPham() {}

    public SanPham(int maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        this.maSP = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSP = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextInt();
    }
    public void output() {
        System.out.printf("%-15d %-20s %-15d %-15d %-15d\n", maSP, tenSP, soLuong, donGia, thanhTien());
    }

    public int thanhTien() {
        return soLuong * donGia;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
