package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private Integer congSuat;
    private Integer giaBan;

    public DieuHoa() {}

    public DieuHoa(Integer maSP, String tenSP, String tenHSX, String ngayNhap, Integer congSuat, Integer giaBan) {
        super(maSP, tenSP, tenHSX, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập công suất: ");
        this.congSuat = sc.nextInt();
        System.out.print("Nhập giá bán: ");
        this.giaBan = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-15d %-15d\n", congSuat, giaBan);
    }

    public Integer getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Integer congSuat) {
        this.congSuat = congSuat;
    }

    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "DieuHoa{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", tenHSX='" + tenHSX + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }
}
