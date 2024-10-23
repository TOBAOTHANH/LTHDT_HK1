package tuan5.bai8_HANGHOA;

class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, String ngayNhapKho) throws ParseException {
        super(maHang, tenHang, soLuongTon, donGia);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhapKho = df.parse(ngayNhapKho);
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.1;
    }

    @Override
    public String danhGia() {
        Date now = new Date();
        long diffInMillies = Math.abs(now.getTime() - ngayNhapKho.getTime());
        long diffDays = diffInMillies / (1000 * 60 * 60 * 24);
        if (soLuongTon > 50 && diffDays > 10) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }
}

// Lớp quản lý danh sách hàng hóa
