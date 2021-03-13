// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {ISKhachHang} from '../dbkhachhang';

// @ts-ignore
@Component({
  selector: 'app-list-khach-hang',
  templateUrl: './list-khach-hang.component.html',
  styleUrls: ['./list-khach-hang.component.css']
})
export class ListKhachHangComponent implements OnInit {
  khachhangs: ISKhachHang[] = [
    // tslint:disable-next-line:max-line-length
    {id: 2321120623, hoTen: 'Phan Thanh Hải', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', maLoai: 3, diaChi: 'Quảng Nam'},
    // tslint:disable-next-line:max-line-length
    {id: 2321120623, hoTen: 'Phan Thanh ', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', maLoai: 3, diaChi: 'Quảng Nam'},
    // tslint:disable-next-line:max-line-length
    {id: 2321120623, hoTen: 'Phan Thanh Hà', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', maLoai: 3, diaChi: 'Quảng Nam'},
    // tslint:disable-next-line:max-line-length
    {id: 2321120623, hoTen: 'Phan Thanh Bình', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', maLoai: 3, diaChi: 'Quảng Nam'},

  ];
  constructor() { }

  ngOnInit(): void {
  }

}
