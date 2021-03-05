package Book;

import java.util.Scanner;

public class DoChoiTreEm extends SanPham {
    private String xuatXu;
    private String thuongHieu;
    private String nhaCC;
    private String huongDSD;

    @Override
    public String toString() {
        return "DoChoiTreEm{" +
                "xuatXu='" + xuatXu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCC='" + nhaCC + '\'' +
                ", huongDSD='" + huongDSD + '\'' +
                '}';
    }

    public DoChoiTreEm(){}
    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getHuongDSD() {
        return huongDSD;
    }

    public void setHuongDSD(String huongDSD) {
        this.huongDSD = huongDSD;
    }

    @Override
    public void Nhap() {
        super.Nhap();
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap xuat xu: ");
            xuatXu = input.nextLine();

            System.out.println("Nhap thuong hieu: ");
            thuongHieu = input.nextLine();

            System.out.println("Nhap nha cung cap: ");
            nhaCC = input.nextLine();

            System.out.println("Nhap huong dan su dung: ");
            huongDSD = input.nextLine();
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(this.toString());

    }

    @Override
    public double PhanTramGiamGia(String loaiKH)
    {
        switch (loaiKH)
        {
            case "Thuong": return 0.02;
            case "VIP1": return 0.05;
            case "VIP2": return 0.07;
        }
        return 0;
    }
}
