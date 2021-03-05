package Book;

public class ThongTinDanhMuc {
    private String maDM;
    private String loaiSach;
    private String moTa;

    public ThongTinDanhMuc(String maDM, String loaiSach, String moTa) {
        this.maDM = maDM;
        this.loaiSach = loaiSach;
        this.moTa = moTa;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
