// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {ISDoChoi, ISDungCu} from '../dbsanpham';

// @ts-ignore
@Component({
  selector: 'app-dungcu',
  templateUrl: './dungcu.component.html',
  styleUrls: ['./dungcu.component.css']
})
export class DungcuComponent implements OnInit {

  dungcus: ISDungCu[] = [
    {maSP: 'BR-0001', tenSP: 'Barrett', soLuong: 3, donGia: 250000, donVi: 'Khẩu', maDanhMucDoChoi: '1', xuatXu: 'America', thuongHieu: 'America',
      nhaCungCap: 'Vincezo', mauSac: 'Red', kichThuoc: '100cm', chatLieu: 'Sắt', huongDan: 'OneShotOneKill'},

  ];

  constructor() { }

  ngOnInit(): void {
  }

}
