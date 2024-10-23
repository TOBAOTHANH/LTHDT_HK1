package tuan5.bai8_HANGHOA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HangHoa {
	 protected String maHang;
	    protected String tenHang;
	    protected int soLuongTon;
	    protected double donGia;

	    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
	        if (maHang.isEmpty()) throw new IllegalArgumentException("Mã hàng không được để trống");
	        if (tenHang.isEmpty()) throw new IllegalArgumentException("Tên hàng không được để trống");
	        if (soLuongTon < 0) throw new IllegalArgumentException("Số lượng tồn phải >= 0");
	        if (donGia <= 0) throw new IllegalArgumentException("Đơn giá phải > 0");

	        this.maHang = maHang;
	        this.tenHang = tenHang;
	        this.soLuongTon = soLuongTon;
	        this.donGia = donGia;
	    }

	    public abstract double tinhVAT();

	    public abstract String danhGia();

	    @Override
	    public String toString() {
	        return "Mã hàng: " + maHang + ", Tên hàng: " + tenHang + ", Số lượng tồn: " + soLuongTon + ", Đơn giá: " + donGia;
	    }
}
