package tuan3.bai6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống.");
        }
        this.maHang = maHang;
        setTenHang(tenHang);      
        setDonGia(donGia);       
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public HangThucPham(String maHang) {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống.");
        }
        this.maHang = maHang;
        this.tenHang = "Không có tên";
        this.donGia = 0;
        this.ngaySanXuat = new Date(); 
        this.ngayHetHan = new Date(); 
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.trim().isEmpty()) {
            this.tenHang = "Tên không hợp lệ";
        } else {
            this.tenHang = tenHang;
        }
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0; 
        }
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if (ngaySanXuat != null) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = new Date(); 
        }
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan != null && ngayHetHan.after(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat; 
        }
    }

    public boolean isExpired() {
        Date today = new Date();
        return ngayHetHan.before(today); 
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        return "Mã hàng: " + maHang +
               "\nTên hàng: " + tenHang +
               "\nĐơn giá: " + currencyFormatter.format(donGia) +
               "\nNgày sản xuất: " + dateFormat.format(ngaySanXuat) +
               "\nNgày hết hạn: " + dateFormat.format(ngayHetHan) +
               "\nHàng hết hạn: " + (isExpired() ? "Có" : "Không");
    }
}
