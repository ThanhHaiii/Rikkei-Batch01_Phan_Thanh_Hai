package Book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThongTinHoaDon {
    private String maHD;
    private String maKH;
    private String maSP;
    private String soLuong;
    private Date ngayMua;
    private float donGia;

    public ThongTinHoaDon(){}

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma hoa don: ");
        maHD = input.nextLine();

        System.out.println("Nhap ma khach hang: ");
        maKH = input.nextLine();

        System.out.println("Nhap so luong: ");
        soLuong = input.nextLine();

        System.out.println("Nhap ngay mua: ");
        try {
            ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine());
        } catch (Exception e){

        }
        System.out.println("Nhap ngay mua: ");
        donGia =Float.parseFloat(input.nextLine());
    }

}
