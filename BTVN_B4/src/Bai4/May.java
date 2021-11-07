package Bai4;

import java.util.Scanner;

public class May {
    private String ma;
    private String kieu;
    private String tinhTrang;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã máy: ");
        ma = sc.nextLine();
        System.out.print("Nhập kiểu máy: ");
        kieu = sc.nextLine();
        System.out.print("Nhập tình trạng: ");
        tinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%20s %20s %20s\n", ma, kieu, tinhTrang);
    }
}
