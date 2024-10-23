package tuan1.bai1_HINHCHUNHAT;
import java.util.Scanner;



public class testHCN  {
	public static int nhapSoNguyen(String thongBao) {
		int a;
		System.out.println(thongBao);
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		return a;
	}
	 public static Rectangle nhapThongTinDoiTuong()
	 {
		 int cd, cr;
		 Rectangle cn;
		 cd=nhapSoNguyen("Nhập chi�?u dài =");
		 cr=nhapSoNguyen("Nhập chi�?u rộng =");
		 cn = new Rectangle(cd,cr);
		 return cn;
	 }
	 static String tieuDe() {
		 return String.format("%-10s %-10s %-12s %-12s", "Chi�?u dài","Chi�?u rộng","Diện tích","Chu vi");
	 }
	 public static void nhapCung() {
		 Rectangle cn1, cn2, cn3;
		 cn1 = new Rectangle(12,6);
		 cn2 = new Rectangle(8, 3);
		 cn3 = new Rectangle(7, 2);
		 System.out.println(cn1);
		 System.out.println(cn2);
		 System.out.println(cn3);
		 
	 }
	 public static void main(String[] args) {
		Rectangle cn1, cn2;
		System.out.println("Chương trình sử lí HCN");
		System.out.println(tieuDe());
		nhapCung();
	}
}
