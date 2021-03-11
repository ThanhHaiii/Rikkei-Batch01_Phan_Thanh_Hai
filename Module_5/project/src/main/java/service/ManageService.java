package service;

import model.KhachHang;

import java.util.ArrayList;
import java.util.List;

public interface ManageService {
    ArrayList<KhachHang> findAll();

    void save(KhachHang kh);

    KhachHang findByID(int id);

    void update(int id,KhachHang kh);

    void remote(int id);

}
