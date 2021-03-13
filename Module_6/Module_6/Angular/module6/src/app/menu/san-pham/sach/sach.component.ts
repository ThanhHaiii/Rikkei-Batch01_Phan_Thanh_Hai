// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {ISSach} from '../dbsanpham';

// @ts-ignore
@Component({
  selector: 'app-sach',
  templateUrl: './sach.component.html',
  styleUrls: ['./sach.component.css']
})
export class SachComponent implements OnInit {

  sachs: ISSach[] = [
    // tslint:disable-next-line:max-line-length
    {maSP: 'S-0001', tenSP: 'Kimetsunoyaiba', soLuong: 3, donGia: 250000, donVi: 'Cuốn', maDanhMucSach: '1', nhaXuatBan: 'JAV', namXuatBan: 1998, tacGia: 'Fukusa', lanTaiBan: 2},
    // tslint:disable-next-line:max-line-length
    // tslint:disable-next-line:max-line-length
    {maSP: 'S-0002', tenSP: 'YourName', soLuong: 3, donGia: 20000, donVi: 'Cuốn', maDanhMucSach: '1', nhaXuatBan: 'JAV', namXuatBan: 2016, tacGia: 'Katsuhiro Takei', lanTaiBan: 2},

  ];

  constructor() { }

  ngOnInit(): void {
  }

}
