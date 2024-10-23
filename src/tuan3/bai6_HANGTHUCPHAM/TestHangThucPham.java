package tuan3.bai6_HANGTHUCPHAM;

import java.util.Calendar;
import java.util.Date;

public class TestHangThucPham {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(2024, Calendar.JANUARY, 1);
        Date ngaySanXuat = cal.getTime();

        cal.set(2024, Calendar.MARCH, 1);
        Date ngayHetHan = cal.getTime();

        HangThucPham htp1 = new HangThucPham("HTP001", "Sữa tươi", 15000, ngaySanXuat, ngayHetHan);
        System.out.println(htp1);

        HangThucPham htp2 = new HangThucPham("HTP002");
        System.out.println("\n" + htp2);

        System.out.println("\nHàng thực phẩm 1 đã hết hạn chưa? " + (htp1.isExpired() ? "Có" : "Không"));

        cal.set(2023, Calendar.DECEMBER, 31);
        Date ngayHetHanKhongHopLe = cal.getTime();
        HangThucPham htp3 = new HangThucPham("HTP003", "Bánh mì", 10000, ngaySanXuat, ngayHetHanKhongHopLe);
        System.out.println("\n" + htp3);
    }
}
