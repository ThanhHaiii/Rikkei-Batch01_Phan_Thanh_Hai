package Book;

import java.util.Scanner;

public class DoDungHocTap extends SanPham {
    private String xuatXu;
    private String thuongHieu;
    private String nhaCC;
    private String huongDSD;
    private String mauSac;
    private String chatLieu;
    private float kichThuoc;

    @Override
    public String toString() {
        return "DoDungHocTap{" +
                "xuatXu='" + xuatXu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCC='" + nhaCC + '\'' +
                ", huongDSD='" + huongDSD + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", chatLieu='" + chatLieu + '\'' +
                ", kichThuoc=" + kichThuoc +
                '}';
    }

    public DoDungHocTap(){}



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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
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

            System.out.println("Nhap mau sac: ");
            mauSac = input.nextLine();

            System.out.println("Nhap chat lieu: ");
            chatLieu = input.nextLine();

            System.out.println("Nhap kich thuoc: ");
            kichThuoc = Float.parseFloat(input.nextLine());
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(this.toString());
    }

    @Override
    public double PhanTramGiamGia(String loaiKH) {
        switch (loaiKH)
        {
            case "Thuong": return 0.01;
            case "VIP1": return 0.03;
            case "VIP2": return 0.07;
        }
        return 0;
    }
}
