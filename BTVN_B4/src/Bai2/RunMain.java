package Bai2;

public class RunMain {
    public static void main(String[] args) {
        NhanSu x = new NhanSu();

        x.nhap();
        System.out.printf("%20s %20s %20s\n", "Mã nhân sự", "Họ tên", "Ngày sinh");
        x.xuat();
    }
}
