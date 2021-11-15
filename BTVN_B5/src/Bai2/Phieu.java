package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private int maPhieu;
    private String tenPhieu;
    private DateTime a;
    private ArrayList<SanPham> x;
    private int n;

    public Phieu() {}

    public Phieu(int maPhieu, String tenPhieu, DateTime a, ArrayList<SanPham> x, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.x = x;
        this.n = n;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        this.maPhieu = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên phiếu: ");
        this.tenPhieu = sc.nextLine();
        System.out.println("Nhập ngày tháng năm: ");
        this.a = new DateTime();
        this.a.input();
        this.x = new ArrayList<>();
        System.out.print("Nhập số lượng sản phẩm: ");
        this.n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i+1));
            SanPham sanPham = new SanPham();
            sanPham.input();
            x.add(sanPham);
        }
    }
    public void output(){
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Tên phiếu: " + tenPhieu);
        System.out.println("Ngày nhập: " + a.output());
        System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền");
        for(SanPham sanPham : x) {
            sanPham.output();
        }
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SanPham> getX() {
        return x;
    }

    public void setX(ArrayList<SanPham> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
