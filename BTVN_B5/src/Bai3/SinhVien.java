package Bai3;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nghanh;
    private int khoaHoc;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nghanh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nghanh = nghanh;
        this.khoaHoc = khoaHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}
