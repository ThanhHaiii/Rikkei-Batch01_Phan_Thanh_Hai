// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {ISNhanVien} from '../dbnhanvien';

// @ts-ignore
@Component({
  selector: 'app-list-nhan-vien',
  templateUrl: './list-nhan-vien.component.html',
  styleUrls: ['./list-nhan-vien.component.css']
})

export class ListNhanVienComponent implements OnInit {
  nhanviens: ISNhanVien[] = [
    {id: 2321120623, hoTen: 'Phan Thanh Hải', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', viTri: 'Phó Giám Đốc', diaChi: 'Quảng Nam'},
    {id: 2321120623, hoTen: 'Phan Thanh Tha', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', viTri: 'Chủ Tịch', diaChi: 'Quảng Nam'},
    // tslint:disable-next-line:max-line-length
    {id: 2321120623, hoTen: 'Phan Thanh', soDienThoai: '0972921511', email: 'thanhhai9@gmail.com', ngaySinh: '23/03/1999', viTri: 'Giám Đốc', diaChi: 'Quảng Nam'},

  ];

  constructor() { }

  ngOnInit(): void {
  }

}
