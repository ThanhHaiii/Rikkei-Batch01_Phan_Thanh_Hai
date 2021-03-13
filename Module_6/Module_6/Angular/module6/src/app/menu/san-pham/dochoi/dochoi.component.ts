// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {ISDoChoi} from '../dbsanpham';

// @ts-ignore
@Component({
  selector: 'app-dochoi',
  templateUrl: './dochoi.component.html',
  styleUrls: ['./dochoi.component.css']
})
export class DochoiComponent implements OnInit {

  dochois: ISDoChoi[] = [
    // tslint:disable-next-line:max-line-length
    {maSP: 'AN-0001', tenSP: 'Anaconda', soLuong: 3, donGia: 50000, donVi: 'Khẩu', maDanhMucDoChoi: '1', xuatXu: 'Italia', thuongHieu: 'Italia', nhaCungCap: 'Vincezo', huongDan: 'OneShotOneKill'},
    // tslint:disable-next-line:max-line-length
    {maSP: 'BR-0002', tenSP: 'Barrett', soLuong: 4, donGia: 20000000, donVi: 'Khẩu', maDanhMucDoChoi: '1', xuatXu: 'America', thuongHieu: 'America', nhaCungCap: 'Object', huongDan: 'OneShotOneKill'},
    // tslint:disable-next-line:max-line-length

  ];
  constructor() { }

  ngOnInit(): void {
  }

}
