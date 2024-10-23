package tuan7.bai3_GIAODICH;

import java.util.Date;

public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public double thanhTien() {
        if (loaiTienTe.equalsIgnoreCase("VN")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * tiGia;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Loại tiền tệ: " + loaiTienTe + ", Tỷ giá: " + tiGia + ", Thành tiền: " + thanhTien();
    }
}
