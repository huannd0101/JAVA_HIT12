package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();

        nhap(lopHoc);
        System.out.println("\n----------------------------------------------Thông tin lớp học----------------------------------------------");
        xuat(lopHoc);

        System.out.println("\nTổng số sinh viên khóa 15: " + getTotalStudentByKhoaHoc(lopHoc, 15));

        System.out.println("\n----------------------------------------------Thông tin lớp học----------------------------------------------");
        sapXep(lopHoc);
        xuat(lopHoc);
    }

    private static void nhap(LopHoc lopHoc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: ");
        lopHoc.setMaLH(sc.nextLine());
        System.out.print("Nhập tên lớp học: ");
        lopHoc.setTenLH(sc.nextLine());
        System.out.print("Nhập ngày mở: ");
        lopHoc.setNgayMo(sc.nextLine());

        System.out.print("Nhập số sinh viên: ");
        lopHoc.setN(sc.nextInt());

        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        for(int i=0; i<lopHoc.getN(); i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap();
            sc.nextLine();
            System.out.print("Nhập mã sinh viên: ");
            sinhVien.setMaSV(sc.nextLine());
            System.out.print("Nhập nghành: ");
            sinhVien.setNghanh(sc.nextLine());
            System.out.print("Nhập khóa học: ");
            sinhVien.setKhoaHoc(sc.nextInt());

            sinhViens.add(sinhVien);
        }
        lopHoc.setX(sinhViens);

        sc.nextLine();
        System.out.print("Nhập tên giáo viên: ");
        lopHoc.setGiaoVien(sc.nextLine());
    }

    private static void xuat(LopHoc lopHoc) {
        System.out.println("Mã lớp học: " + lopHoc.getMaLH());
        System.out.println("Tên lớp học: " + lopHoc.getTenLH());
        System.out.println("Ngày mở: " + lopHoc.getNgayMo());
        System.out.println("Tên giáo viên: " + lopHoc.getGiaoVien());

        System.out.printf("%-20s %-20s %-20s %-15s %-20s %-15s\n", "Họ tên", "Ngày sinh", "Quê quán", "Mã SV", "Nghành", "Khóa học");
        for(SinhVien sinhVien : lopHoc.getX()) {
            System.out.printf(
                    "%-20s %-20s %-20s %-15s %-20s %-15d\n",
                    sinhVien.getHoTen(),
                    sinhVien.getNgaySinh(),
                    sinhVien.getQueQuan(),
                    sinhVien.getMaSV(),
                    sinhVien.getNghanh(),
                    sinhVien.getKhoaHoc()
            );
        }
    }

    private static int getTotalStudentByKhoaHoc(LopHoc lopHoc, int khoaHoc) {
        int cnt = 0;
        for(SinhVien sinhVien : lopHoc.getX()) {
            if(sinhVien.getKhoaHoc() == khoaHoc) {
                cnt++;
            }
        }
        return cnt;
    }

    private static void sapXep(LopHoc lopHoc) {
        for(int i=0; i<lopHoc.getN()-1; i++) {
            for(int j=lopHoc.getN()-1; j>i; j--) {
                if(lopHoc.getX().get(j-1).getKhoaHoc() > lopHoc.getX().get(j).getKhoaHoc()) {
                    SinhVien temp = lopHoc.getX().get(j-1);
                    lopHoc.getX().set(j-1, lopHoc.getX().get(j));
                    lopHoc.getX().set(j, temp);
                }
            }
        }
    }
}
