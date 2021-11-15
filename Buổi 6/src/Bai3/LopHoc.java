package Bai3;

import java.util.ArrayList;

public class LopHoc {
    private String maLH, tenLH, ngayMo, giaoVien;
    private int n;
    private ArrayList<SinhVien> x;

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, String giaoVien, int n, ArrayList<SinhVien> x) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.giaoVien = giaoVien;
        this.n = n;
        this.x = x;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }
}
