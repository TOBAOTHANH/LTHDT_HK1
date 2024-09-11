package tuan3.bai7;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public SinhVien() {
        this.maSinhVien = 0;
        this.hoTen = "";
        this.diaChi = "";
        this.soDienThoai = "";
    }

    public SinhVien(int maSinhVien, String hoTen, String diaChi, String soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        setSoDienThoai(soDienThoai); 
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        if (soDienThoai != null && soDienThoai.matches("\\d{7}")) {
            this.soDienThoai = soDienThoai;
        } else {
            this.soDienThoai = "0000000"; 
        }
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSinhVien + ", Họ tên: " + hoTen + 
               ", Địa chỉ: " + diaChi + ", Số điện thoại: " + soDienThoai;
    }
}

