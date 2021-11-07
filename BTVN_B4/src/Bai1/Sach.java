package Bai1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private float giaTien;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.print("Nhập nha xuất bản: ");
        nxb = sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien = sc.nextFloat();
    }

    public void xuat(){
        System.out.printf("%20s %20s %20s %15d %15f\n", maSach, tenSach, nxb, soTrang, giaTien);
    }


}
