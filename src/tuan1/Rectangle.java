package tuan1;

public class Rectangle {
	private int chieudai, chieurong;

	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int cd) {
		this.chieudai = cd;
	}

	public int getChieurong() {
		return chieurong;
	}

	public void setChieurong(int cr) {
		this.chieurong = cr;
	}

	public Rectangle(int cd, int cr) {
		super();
		  this.chieudai = cd;
	      this.chieurong = cr;
		// TODO Auto-generated constructor stub
	}
	public long tinhDienTich() {
		int cd,cr;
		long dientich;
		cd= this.getChieudai();
		cr= this.getChieurong();
		dientich= cd * cd;
		return dientich;
	}
	public long tinhChuVi() {
		int cd,cr;
		long chuvi;
		cd= this.getChieudai();
		cr= this.getChieurong();
		chuvi = (cd + cr) * 2;
		return chuvi;
	}

	@Override
	public String toString() {
		return String.format("%10d %10d %12d %12d",getChieudai(),getChieurong(), tinhDienTich(),tinhChuVi());	
		}
	
	


	
}
