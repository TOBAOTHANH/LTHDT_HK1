package tuan7.bai3_GIAODICH;

import java.util.Date;

public abstract class GiaoDich {
    protected String maGiaoDich;
    protected Date ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public abstract double thanhTien();

    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return "Mã giao dịch: " + maGiaoDich + ", Ngày giao dịch: " + ngayGiaoDich + ", Đơn giá: " + donGia + ", Số lượng: " + soLuong;
    }
}
