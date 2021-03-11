package model;

import java.util.Date;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String email;
    private int SDT;
    private Date ngSinh;
    private String maLoai;

    public KhachHang(){}
    public KhachHang(String maKH, String tenKH, String email, int SDT, Date ngSinh, String maLoai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.email = email;
        this.SDT = SDT;
        this.ngSinh = ngSinh;
        this.maLoai = maLoai;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }
}
