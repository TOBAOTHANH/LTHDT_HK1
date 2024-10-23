package tuan4.bai2_Sach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class SachGiaoKhoa extends Sach {
    private String tinhTrang; 

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("mới")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

   

    @Override
    public String toString() {
        return super.toString() + String.format("|%-10s|", tinhTrang); // In thêm tình trạng sách
    }
}

