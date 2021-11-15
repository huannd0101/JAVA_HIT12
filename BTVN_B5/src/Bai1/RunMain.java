package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    private static ArrayList<DieuHoa> dieuHoas = new ArrayList<>();
    private static int n;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhap();

        System.out.println("\n--------------------------------------Danh sách vừa nhập--------------------------------------");
        xuat();

        System.out.println("\n-----------------------------------Danh sách hãng Electrolux----------------------------------");
        hienThiDieuHoaTheoTenHSX("Electrolux");

        System.out.println("\n-------------------------------Danh sách sản phẩm giá thấp nhất-------------------------------");
        hienThiDieuHoaCoGiaThapNhat();
    }

    private static void nhap() {
        System.out.print("Nhập số lượng điều hòa: ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            System.out.println("Nhập thông tin điều hòa thứ " + (i+1));
            DieuHoa dieuHoa = new DieuHoa();
            dieuHoa.nhap();
            dieuHoas.add(dieuHoa);
        }
    }

    private static void xuat() {
        System.out.printf("%-15s %-20s %-20s %-20s %-15s %-15s\n", "Mã SP", "Tên SP", "Tên HSX", "Ngày nhập", "Công suất", "Giá bán");
        for (DieuHoa dieuHoa : dieuHoas) {
            dieuHoa.xuat();
        }
    }

    private static void hienThiDieuHoaTheoTenHSX(String tenHSX) {
        boolean ok = false;
        System.out.printf("%-15s %-20s %-20s %-20s %-15s %-15s\n", "Mã SP", "Tên SP", "Tên HSX", "Ngày nhập", "Công suất", "Giá bán");
        for (DieuHoa dieuHoa : dieuHoas) {
            if(dieuHoa.getTenHSX().compareToIgnoreCase(tenHSX) == 0) {
                dieuHoa.xuat();
                ok = true;
            }
        }
        if(!ok) {
            System.out.println("\t Không có điều hòa nào có tên HSX: " + tenHSX);
        }
    }

    private static int findPriceMin() {
        int min = dieuHoas.get(0).getGiaBan();
        for (DieuHoa dieuHoa : dieuHoas) {
            min = (dieuHoa.getGiaBan() < min) ? dieuHoa.getGiaBan() : min;
        }
        return min;
    }

    private static void hienThiDieuHoaCoGiaThapNhat() {
        int min = findPriceMin();
        System.out.printf("%-15s %-20s %-20s %-20s %-15s %-15s\n", "Mã SP", "Tên SP", "Tên HSX", "Ngày nhập", "Công suất", "Giá bán");
        for (DieuHoa dieuHoa : dieuHoas) {
            if(dieuHoa.getGiaBan() == min) {
                dieuHoa.xuat();
            }
        }
    }
}
