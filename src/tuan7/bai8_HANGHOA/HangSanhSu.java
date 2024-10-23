package tuan7.bai8_HANGHOA;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;
   

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        Date now = new Date();
        long timeDiff = now.getTime() - ngayNhapKho.getTime();
        int daysInStock = (int) (timeDiff / (1000 * 60 * 60 * 24)); // Tính số ngày lưu kho
        if (soLuongTon > 50 && daysInStock > 10) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.1;  // VAT của hàng sành sứ là 10%
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + String.format(", Nhà sản xuất: %s, Ngày nhập kho: %s", nhaSanXuat, sdf.format(ngayNhapKho));
    }
}
