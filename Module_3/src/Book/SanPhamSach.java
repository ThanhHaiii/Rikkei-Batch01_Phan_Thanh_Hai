package Book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanPhamSach extends SanPham {
    private String nhaXB;
    private String namXB="^\\d{4}$";
    private String tacGia;
    private Date ngaySX;
    private int lanTaiBan;

    @Override
    public String toString() {
        return "SanPhamSach{" +
                "nhaXB='" + nhaXB + '\'' +
                ", namXB='" + namXB + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", ngaySX=" + ngaySX +
                ", lanTaiBan=" + lanTaiBan +
                '}';
    }

    public SanPhamSach()
    {

    }
    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getNamXB() {
        return namXB;
    }

    public void setNamXB(String namXB) {
        this.namXB = namXB;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    @Override
    public void Nhap() {
        super.Nhap();
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap nha xuat ban: ");
            nhaXB = input.nextLine();

            System.out.println("Nhap nam xuat ban: ");
            namXB =input.nextLine();

            System.out.println("Nhap ten tac gia: ");
            tacGia = input.nextLine();

            System.out.println("Nhap ngay san xuat: ");
                try {
                    ngaySX = new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine());
                } catch (Exception e){

                }

            System.out.println("Nhap lan tai ban: ");
            while (true){
                lanTaiBan =Integer.parseInt(input.nextLine());
                if (lanTaiBan>0)
                {
                    break;
                }else{
                    System.err.println("Nhap lai lan tai ban: ");
                }


            }
    }
    @Override
    public void HienThiThongTin() {
        super.HienThiThongTin();
        System.out.println(this.toString());
    }

    @Override
    public double PhanTramGiamGia(String loaiKH) {
        switch (loaiKH)
        {
            case "Thuong": return 0.02;
            case "VIP1": return 0.05;
            case "VIP2": return 0.1;
        }
        return 0;
    }

}