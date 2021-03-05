package Book;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int choose;
        int n;
        ArrayList<ThongTinKhachHang>thongtinList  = new ArrayList<>();
        ArrayList<SanPhamSach>sanphamList  = new ArrayList<>();
        ArrayList<DoChoiTreEm>dochoiList  = new ArrayList<>();
        ArrayList<DoDungHocTap>dodungList  = new ArrayList<>();
        ArrayList<ThongTinHoaDon>hoaDonList  = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());

            switch (choose)
            {
                case 1:
                    System.out.println("Nhap so khach hang can them: ");
                    n= Integer.parseInt(input.nextLine());
                    for (int i=0;i<n;i++)
                    {
                        ThongTinKhachHang thongtin = new ThongTinKhachHang();
                        thongtin.Nhap();

                        thongtinList.add(thongtin);
                    }
                    for(ThongTinKhachHang item:thongtinList) {
                        FileName.writeFile(file_name1, item.toString());
                    }
                    break;
                case 2:
                    System.out.println("Nhap so san pham can them: ");
                    n= Integer.parseInt(input.nextLine());
                    for (int i=0;i<n;i++)
                    {
                        SanPhamSach sanpham = new SanPhamSach();
                        sanpham.Nhap();

                        sanphamList.add(sanpham);
                    }
                    for(SanPhamSach item:sanphamList){
                        FileName.writeFile(file_name,item.toString());
                    }
                    break;
                case 3:
                    System.out.println("Nhap do dung hoc tap can them: ");
                    n=Integer.parseInt(input.nextLine());
                    for (int i=0;i<n;i++)
                    {
                        DoDungHocTap dodung = new DoDungHocTap();
                        dodung.Nhap();

                        dodungList.add(dodung);
                    }
                    for(DoDungHocTap item:dodungList){
                        FileName.writeFile(file_name2,item.toString());
                    }
                    break;
                case 4:
                    System.out.println("Nhap do choi tre em can them: ");
                    n=Integer.parseInt(input.nextLine());
                    for (int i=0;i<n;i++)
                    {
                        DoChoiTreEm dochoi = new DoChoiTreEm();
                        dochoi.Nhap();

                        dochoiList.add(dochoi);
                    }
                    for(DoChoiTreEm item:dochoiList){
                        FileName.writeFile(file_name3,item.toString());
                    }
                    break;
                case 5:
                    System.out.println("Nhap hoa don khach hang: ");
                    n=Integer.parseInt(input.nextLine());
                    for (int i=0;i<n;i++)
                    {
                        ThongTinHoaDon hoadon = new ThongTinHoaDon();
                        hoadon.Nhap();

                        hoaDonList.add(hoadon);
                    }
                    for(ThongTinHoaDon item:hoaDonList){
                        FileName.writeFile(file_name4,item.toString());
                    }
                    break;
                case 6:
                    String tim;
                    System.out.println("Nhap thong tin can tim: ");
                    tim = input.nextLine();
                    for (int i=0;i<sanphamList.size();i++)
                    {
                        if (sanphamList.get(i).getMaSP().equalsIgnoreCase(tim))
                        {
                            System.out.println("Ban Da Tim Thanh Cong Roi Nha!");
                        }
                        else
                            {
                            System.out.println("Tim Khong Thay Nha!");
                        }
                    }
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }

        }while (choose != 6);

    }
    static void showMenu(){
        System.out.println("1. Nhap thong tin khach hang: ");
        System.out.println("2. Nhap thong tin sach: ");
        System.out.println("3. Nhap thong tin do dung hoc tap: ");
        System.out.println("4. Nhap thong tin do choi tre em: ");
        System.out.println("5. Nhap thong tin do choi tre em: ");
        System.out.println("6. Nhap thong tin can tim kiem: ");
        System.out.println("----------------------------------");
    }
    public static final String file_name="src/Files/Sach.csv";
    public static final String file_name1="src/Files/Khachhang.csv";
    public static final String file_name2="src/Files/Dodunghoctap.csv";
    public static final String file_name3="src/Files/Dochoitreem.csv";
    public static final String file_name4="src/Files/Donghang.csv";
}
