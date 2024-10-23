package tuan7.bai8_HANGHOA;

import java.text.SimpleDateFormat;

public abstract class HangHoa implements itf {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống");
        }
        if (tenHang == null || tenHang.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để trống");
        }
        if (soLuongTon < 0) {
            throw new IllegalArgumentException("Số lượng tồn phải >= 0");
        }
        if (donGia <= 0) {
            throw new IllegalArgumentException("Đơn giá phải > 0");
        }
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return String.format("Mã hàng: %s, Tên hàng: %s, Số lượng tồn: %d, Đơn giá: %.2f", maHang, tenHang, soLuongTon, donGia);
    }

    
    public abstract String danhGiaMucDoBanBuon();
    public abstract double tinhVAT();
}
