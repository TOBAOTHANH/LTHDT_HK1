package tuan7.bai8_HANGHOA;

import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa {
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (soLuongTon > 0 && ngayHetHan.before(new Date())) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.05;  // VAT của hàng thực phẩm là 5%
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + String.format(", Ngày sản xuất: %s, Ngày hết hạn: %s, Nhà cung cấp: %s",
                sdf.format(ngaySanXuat), sdf.format(ngayHetHan), nhaCungCap);
    }
}
