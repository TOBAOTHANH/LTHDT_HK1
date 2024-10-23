package tuan7.bai3_GIAODICH;

import java.util.Date;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Loại vàng: " + loaiVang + ", Thành tiền: " + thanhTien();
    }
}
