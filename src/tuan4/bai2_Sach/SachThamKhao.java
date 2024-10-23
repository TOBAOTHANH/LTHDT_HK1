package tuan4.bai2_Sach;

import java.time.LocalDate;

class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thuế: " + thue + ", Thành tiền: " + tinhThanhTien();
    }
}
