package Bai3;

import java.util.Scanner;

public class Phieu {
    private String ma;
    private Hang[] x;
    private int n;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        ma = sc.nextLine();
        System.out.print("Nhập số hàng hóa: ");
        n = sc.nextInt();
        x = new Hang[n];
        for (int i=0; i<n; i++){
            System.out.println("Nhập mặt hàng thứ "+ (i+1) + ": ");
            x[i] = new Hang();
            x[i].nhap();
        }
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void xuat(){
        float sum=0;
        System.out.printf("Ma phieu : %s\n", ma);
        System.out.printf("%20s %20s %20s\n", "Ma hang", "Ten hang", "Don gia");
        for (int i=0; i<n; i++){
            sum += x[i].getDonGia();
            x[i].xuat();
        }
        System.out.println("Tổng tiền: "+ sum);
    }
}
