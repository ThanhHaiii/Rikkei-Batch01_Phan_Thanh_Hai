package Book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThongTinKhachHang {
    private String maKH;
    private String hoTen;
    private String SDT="^84\\d{7}$";
    private String Email="^\\w+@\\w+(\\.\\w+){1,2}$";
    private Date ngSinh;
    private String loaiKH;

    public ThongTinKhachHang(){}

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma khach hang: ");
        maKH = input.nextLine();

        System.out.println("Nhap ho ten khach hang: ");
        hoTen = input.nextLine();

        System.out.println("Nhap so dien thoai: ");
        SDT = input.nextLine();

        System.out.println("Nhap Email: ");
        Email =input.nextLine();

        System.out.println("Nhap ngay sinh: ");
        try {
            ngSinh = new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine()
            );
        } catch (Exception e){

        }

        System.out.println("Nhap loai khach hang: ");
        loaiKH = input.nextLine();
    }
}
