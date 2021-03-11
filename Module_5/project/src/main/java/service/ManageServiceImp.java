package service;

import model.KhachHang;

import java.util.ArrayList;

public class ManageServiceImp implements ManageService {

    private static ArrayList<KhachHang> khang;
    @Override
    public ArrayList<KhachHang> findAll() {
        return new ArrayList<>(khang);
    }

    @Override
    public void save(KhachHang kh) {
        khang.add(kh);

    }

    @Override
    public KhachHang findByID(int id) {
        return khang.get(id);
    }

    @Override
    public void update(int id, KhachHang kh) {
        khang.add(id,kh);

    }

    @Override
    public void remote(int id) {
        khang.remove(id);

    }
}
