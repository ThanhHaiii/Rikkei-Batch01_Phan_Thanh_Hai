package Book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected String soLuong;
    protected float donGia;
    protected String thuocDM;

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", donGia=" + donGia +
                ", thuocDM='" + thuocDM + '\'' +
                '}';
    }

    public SanPham()
    {

    }
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getThuocDM() {
        return thuocDM;
    }

    public void setThuocDM(String thuocDM) {
        this.thuocDM = thuocDM;
    }


    public  void Nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("=====THÊM SÁCH=====");
        System.out.println("Nhap ma san pham: ");
        maSP = input.nextLine();

        System.out.println("Nhap ten san pham: ");
        tenSP =input.nextLine();

        System.out.println("Nhap so luong: ");
        soLuong = input.nextLine();

        System.out.println("Nhap don gia: ");
        donGia = Float.parseFloat(input.nextLine());

        System.out.println("Nhap thuoc danh muc: ");
        thuocDM = input.nextLine();
    }
    public void HienThiThongTin()
    {
        System.out.println(this.toString());
    }
    public double PhanTramGiamGia(String loaiKH)
    {
        return 0;
    }

}
