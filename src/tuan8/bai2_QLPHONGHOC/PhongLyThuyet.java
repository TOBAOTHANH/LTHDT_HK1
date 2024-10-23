package tuan8.bai2_QLPHONGHOC;

class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean datChuan() {
        return duAnhSang() && coMayChieu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Có máy chiếu: " + (coMayChieu ? "Có" : "Không");
    }
}
