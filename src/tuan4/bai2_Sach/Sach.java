package tuan4.bai2_Sach;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    protected String maSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public double getDonGia() {
        return donGia;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00 VND"); // Định dạng đơn giá
        String dongiaString = df.format(getDonGia());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Định dạng ngày tháng
        String ngayNhapFormatted = dtf.format(getNgayNhap());

      
		return String.format("|%-10s|%-15s|%-15s|%-10d|%-20s|", 
                             maSach, ngayNhapFormatted, dongiaString, soLuong, nhaXuatBan);
    }
}



