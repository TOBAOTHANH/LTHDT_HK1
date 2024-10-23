package tuan8.bai2_QLPHONGHOC;

class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public boolean duAnhSang() {
        return (dienTich / soBongDen) <= 10;
    }

    public String getMaPhong() {
        return maPhong;
    }

    @Override
    public String toString() {
        return "Mã phòng: " + maPhong + ", Dãy nhà: " + dayNha + ", Diện tích: " + dienTich + ", Số bóng đèn: " + soBongDen;
    }
    
    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }
}

