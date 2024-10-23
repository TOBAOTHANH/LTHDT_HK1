package tuan5.bai8_HANGHOA;

import java.text.SimpleDateFormat;

class HangThucPham extends HangHoa {
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, String ngaySanXuat, String ngayHetHan, String nhaCungCap) throws ParseException {
        super(maHang, tenHang, soLuongTon, donGia);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySanXuat = df.parse(ngaySanXuat);
        this.ngayHetHan = df.parse(ngayHetHan);
        if (this.ngayHetHan.before(this.ngaySanXuat)) {
            throw new IllegalArgumentException("Ngày hết hạn phải sau hoặc bằng ngày sản xuất");
        }
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.05;
    }

    @Override
    public String danhGia() {
        Date now = new Date();
        if (soLuongTon > 0 && ngayHetHan.before(now)) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }
}

// Lớp HangDienMay
class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh; // Tháng
    private double congSuat; // KW

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        if (thoiGianBaoHanh < 0) throw new IllegalArgumentException("Thời gian bảo hành phải >= 0");
        if (congSuat <= 0) throw new IllegalArgumentException("Công suất phải > 0");
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.1;
    }

    @Override
    public String danhGia() {
        if (soLuongTon < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }
}