package tuan8.bai2_QLPHONGHOC;

class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public boolean datChuan() {
        return duAnhSang() && (dienTich / soMayTinh >= 1.5);
    }

    public void capNhatSoMayTinh(int soMayTinhMoi) {
        this.soMayTinh = soMayTinhMoi;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số máy tính: " + soMayTinh;
    }
}
