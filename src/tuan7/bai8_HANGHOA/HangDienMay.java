package tuan7.bai8_HANGHOA;

public  class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (soLuongTon < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.1;  // VAT của hàng điện máy là 10%
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Thời gian bảo hành: %d tháng, Công suất: %.2f KW", thoiGianBaoHanh, congSuat);
    }
}
