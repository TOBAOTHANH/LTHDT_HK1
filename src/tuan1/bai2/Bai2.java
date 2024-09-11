package tuan1.bai2;

public class Bai2 {
	private int maSV;
	private String tenSV;
	private double diemLT;
	private double diemTH;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	public Bai2(int maSV, String tenSV, double diemLT, double diemTH) {
		super();
		this.maSV = maSV;
		this.tenSV= tenSV;
		this.diemLT= diemLT;
		this.diemTH = diemTH;
		
		
	}
	public Bai2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("MASV= %10d|TENSV = %10d|DIEMLT= %12d|DIEMTH = %12d",getMaSV(),getTenSV(),getDiemLT(),getDiemTH());
				
		
	}
	
	
	
	
	
	
}
