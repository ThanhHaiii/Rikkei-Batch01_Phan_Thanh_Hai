create database QLNHASACH;

use qlnhasach;

create table DMSACH(
MaDMSach varchar(10) not null,
TheLoai varchar(20),
MoTa varchar(300),
primary key (MaDMSach)
);
create table DMDoChoi(
MaDMDoChoi varchar(10) not null,
TheLoai varchar(20),
MoTa varchar(300),
primary key (MaDMDoChoi)
);
create table DMDungCu(
MaDMDungCu varchar(10) not null,
TheLoai varchar(20),
MoTa varchar(300),
primary key (MaDMDungCu)
);
create table SanPhamSach(
MaSPSach varchar(10) not null,
TenSPSach varchar(50),
SoLuong int,
DonGia decimal,
DonVi int,
MaDMSach varchar(10),
NhaXuatBan varchar(30),
NamXuatBan int,
TacGia varchar(20),
NgayXuatBan date,
LanTaiBan int,
primary key (MaSPSach),
foreign key (MaDMSach) references DMSACH(MaDMSach)
);
create table SanPhamDoChoi(
MaSPDoChoi varchar(10) not null,
TenSPDoChoi varchar(20),
SoLuong int,
DonGia double,
DonVi int,
MaDMDoChoi varchar(10),
XuatXu varchar(30),
ThuongHieu varchar(30),
NhaCungCap varchar(20),
HuongDan varchar(300),
primary key (MaSPDoChoi),
foreign key (MaDMDoChoi) references DMDoChoi(MaDMDoChoi)
);
create table SanPhamDungCu(
MaSPDungCu varchar(10) not null,
TenSPDungCu varchar(20),
SoLuong int,
DonGia double,
DonVi int,
MaDMDungCu varchar(10),
XuatXu varchar(30),
ThuongHieu varchar(30),
NhaCungCap varchar(20),
MauSac varchar(20),
KichThuoc float,
ChatLieu varchar(20),
HuongDan varchar(300),
primary key (MaSPDungCu),
foreign key (MaDMDungCu) references DMDungCu(MaDMDungCu)
);
create table NhanVien(
MaNhanVien varchar(10) not null,
TenNhanVien varchar(30),
NgaySinh date,
ViTri varchar(20),
SoDienThoai int,
Email varchar(30),
DiaChi varchar(50),
primary key (MaNhanVien)
);
create table ChiTietDonHang(
MaDonHang varchar(10) not null,
MaSanPham varchar(10),
SoLuong int,
foreign key (MaDonHang) references DonHang(MaDonHang),
foreign key (MaSanPham) references SanPhamDoChoi(MaSPDoChoi),
foreign key (MaSanPham) references SanPhamDungCu(MaSPDungCu),
foreign key (MaSanPham) references SanPhamSach(MaSPSach)
);
create table DonHang(
MaDonHang varchar(10) not null,
MaKhachHang varchar(10),
MaNhanVien varchar(10),
NgayMuaHang datetime,
TongTien double,
foreign key (MaNhanVien) references NhanVien(MaNhanVien),
foreign key (MaKhachHang) references KhachHang(MaKhachHang),
primary key (MaDonHang)
);
create table KhachHang(
MaKhachHang varchar(10) not null,
TenKhachHang varchar(30),
NgaySinh date,
SoDienThoai varchar(20),
Email varchar(20),
MaLoai varchar(10),
foreign key (MaLoai) references LoaiKhachHang(MaLoai),
primary key (MaKhachHang)
);
create table LoaiKhachHang(
MaLoai varchar(10) not null,
TenLoai varchar(50),
primary key (MaLoai)
);


insert into dmsach values(1,N'Văn Học',' ');
insert into dmsach values(2,N'Khoa Học',' ');
insert into dmsach values(3,N'Chính Trị',' ');
insert into dmsach values(4,N'Tôn Giáo',' ');
insert into dmsach values(5,N'Thiếu Nhi',' ');

insert into dmdochoi values(1,N'Nhóm 0-3 tuổi',' ');
insert into dmdochoi values(2,N'Nhóm 4-8 tuổi',' ');
insert into dmdochoi values(3,N'Nhóm trên 8 tuổi',' ');

insert into dmdungcu values(1,N'Tiểu học',' ');
insert into dmdungcu values(2,N'Trung học',' ');
insert into dmdungcu values(3,N'Phổ thông',' ');

insert into loaikhachhang values(1,N'Loại thường');
insert into loaikhachhang values(2,N'Loại VIP1');
insert into loaikhachhang values(3,N'Loại VIP2');


insert into nhanvien values(1,N'Trần Hoàng Anh','1999/12/26',N'Nhân Viên','0363689258','hoanganhtran669@gmail.com',N'Quảng Bình');
insert into nhanvien values(2,N'Nguyễn Thị Minh Hoàng','1999/1/9',N'Nhân Viên','0363689258','minhoangpro@gmail.com',N'Quảng Bình');
insert into nhanvien values(3,N'Ngô Minh Cường','1999/11/11',N'Trưởng phòng','0366458259','minhcuong336@gmail.com',N'Quảng Nam');
insert into nhanvien values(4,N'Nguyễn Thị Kiều Trang','1999/6/4',N'Thư ký','036442563','trangwookie@gmail.com',N'Quảng Bình');
insert into nhanvien values(5,N'Phan thị Diệu Hiền','1999/12/13',N'Phó Phòng','0364002503','hiendieudieu@gmail.com',N'Dak Lak');
insert into nhanvien values(6,N'Nguyễn Viết Trọng','1999/8/3',N'Trưởng phòng','036552586','trongtrungtinh@gmail.com',N'Quảng Ngãi');
insert into nhanvien values(7,N'Nguyễn Hậu','1999/1/1',N'Nhân Viên','036399999','haudnit@gmail.com',N'Đà Nẵng');
insert into nhanvien values(8,N'Nguyễn Thị Hồng','1999/10/10',N'Phó Phòng','036805589','hongnguyenbdxxx@gmail.com',N'Quảng Nam');
insert into nhanvien values(9,N'Trần Viết Nhân','1999/10/12',N'Trưởng Phòng','0363689777','nhannhunhon@gmail.com',N'Quảng Bình');
insert into nhanvien values(10,N'Võ Thắng Thua','1999/7/7',N'Nhân Viên','0363689999','thangqn@gmail.com',N'Quảng Bình');


insert into khachhang values(1,N'Trần Hoàng Hy','thangqn@gmail.com','0363688925','2002/1/2',2);
insert into khachhang values(2,N'Hoàng Hy An','anhyhoang@gmail.com','0363685525','2004/11/2',3);
insert into khachhang values(4,N'Đào Bá ','badao002@gmail.com','036389440','2002/1/2',2);
insert into khachhang values(5,N'Nguyễn Bảo Khang','khangbao@gmail.com','03669220','2002/1/10',2);
insert into khachhang values(6,N'Phạm Hoàng Hiền My','Mypham@gmail.com','036445289','2004/10/11',1);
insert into khachhang values(10,N'Cầu Thị Ước Mơ','uocmocau@gmail.com','0355988244','2003/11/02',1);

insert into sanphamsach values('sps1',N'ANIMORPHS - NGƯỜI HÓA','100','54400','quyển','5','Hội nhà văn','2019','K.A Applegate','2019/11/27',1);
insert into sanphamsach values('sps2',N'BÍ ẨN VỀ CON CHÓ LÚC NỬA ĐÊM','100','60000','quyển','2','Văn Học','2019','Mark Haddon','2019/11/07',1);
insert into sanphamsach values('sps3',N'TÔI LÀ AI VÀ NẾU VẬY THÌ BAO NHIÊU','50','116000','quyển','3','Thế giới','2018','Mary Roach','2018/10/27',2);
insert into sanphamsach values('sps4',N'TOÁN HỌC, MỘT THIÊN TIỂU THUYẾT','20','88000','quyển','2','Thế giới','2019','Mickaël Launay','2019/05/16',2);
insert into sanphamsach values('sps5',N'HỌC KIỂU MỸ TẠI NHÀ','100','94400','quyển','1','Thế giới','2019','Hong Dinh','2019/04/10',1);
insert into sanphamsach values('sps6',N'21 BÀI HỌC CHO THẾ KỶ 21','188','167200','quyển','4','Thế giới','2018','Yuval Noah Harari','2019/02/10',1);
insert into sanphamsach values('sps7',N'HOA VẪN NỞ MỖI NGÀY','55','187000','quyển','1','Hà Nội','2020','Valérie Perrin','2020/11/03',1);
insert into sanphamsach values('sps8',N'CHÚC MẸ NGỦ NGON','66','116000','quyển','1','Hà Nội','2020','Thomas Cathcart - Daniel Klein','2020/09/21',1);
insert into sanphamsach values('sps9',N'NÓI LUÔN CHO NÓ VUÔNG','63','72000','quyển','1','Thế giới','2018','Steve Harvey','2018/09/30',1);
insert into sanphamsach values('sps10',N'TRIẾT HỌC NGHỆ THUẬT CỦA HEIDEGGER','30','128000','quyển','5','Thế Giới','2020','Julian Young','2020/03/01',1);


insert into sanphamdochoi values('spdcc01',N'Ty ngậm Kuku',2,320000,'con',1,'Mỹ','Phương Đông','Duy Tân','');
insert into sanphamdochoi values ('spdcc02',N'Thú nhún',2,320000,'con',1,'Mỹ','Phương Đông','Duy Tân','');
insert into sanphamdochoi values ('spdcc03',N'Tàu lượn',4,110000,'chiếc',3,'Úc','Logger','Big C ','');
insert into sanphamdochoi values ('spdcc04',N'Xe mô hình',3,160000,'chiếc',1,'Việt Nam','ABC','GameLoft','');
insert into sanphamdochoi values ('spdcc05',N'Xe cẩu',2,550000,'chiếc',2,'Triều Tiên','Yamaha','Ochahous','');
insert into sanphamdochoi values ('spdcc06',N'Búp bê',6,140000,'con',1,'Việt Nam','Elesa','Gong Cha','');
insert into sanphamdochoi values ('spdcc07',N'Lắp ráp',7,300000,'cái',3,'Trung Quốc','Hồng Hà','Phi Long','');
insert into sanphamdochoi values ('spdcc08',N'Xe mô hình',5,420000,'chiếc',1,'Italia','ABCD','Bông','');
insert into sanphamdochoi values ('spdcc09',N'Xe đẩy',2,290000,'chiếc',2,'Việt Nam','ABC','Lotter','');
insert into sanphamdochoi values ('spdcc10',N'Xe đẩy',2,240000,'chiếc',2,'Việt Nam','ABC','Lotter','');


insert into donhang values(1,10,2,'2021/02/15', 123456);
insert into donhang values(2,2,10,'2021/02/15',123 );
insert into donhang values(3,6,7,'2021/02/15', 454643);
insert into donhang values(4,4,6,'2021/02/15', 1454);
insert into donhang values(5,5,8,'2021/02/15', 435345);
insert into donhang values(6,6,5,'2021/02/15', 7876);
insert into donhang values(7,5,9,'2021/02/15', 67676);
insert into donhang values(8,1,6,'2021/02/15', 876867);
insert into donhang values(9,2,5,'2021/02/15', 676767);
insert into donhang values(10,2,3,'2021/02/15',56565);

insert into chitietdonhang values(1,'s01',10);
insert into chitietdonhang values(2,'s02',10);
insert into chitietdonhang values(3,'spdc02',10);
insert into chitietdonhang values(10,'spdc06',10);
insert into chitietdonhang values(5,'spdc7',10);
insert into chitietdonhang values(8,'s01',10);
insert into chitietdonhang values(2,'s06',10);
insert into chitietdonhang values(8,'s09',10);
insert into chitietdonhang values(6,'spdc04',10);
insert into chitietdonhang values(1,'spdc2',10);


#Query2

select *from sanphamdochoi
where sanphamdochoi.soluong > 20 and sanphamdochoi.dongia< 1000000;

select *from sanphamdungcu
where sanphamdungcu.soluong > 20 and sanphamdungcu.dongia< 1000000;

select *from sanphamsach
where sanphamsach.soluong > 20 and sanphamsach.dongia< 1000000;
 #Query3
select * from khachhang
where round(datediff(now(),khachhang.NgaySinh)/365) between 16 and 30 AND round(datediff(now(),khachhang.NgaySinh)/365)=40;


 







