package tuan7.bai8_HANGHOA;

import java.util.ArrayList;

public class QuanLyHangHoa {
    private ArrayList<HangHoa> danhSachHangHoa;

    public QuanLyHangHoa() {
        danhSachHangHoa = new ArrayList<>();
    }

    // Thêm hàng hóa vào danh sách, kiểm tra trùng mã hàng
    public boolean themHangHoa(HangHoa hangHoa) {
        for (HangHoa hh : danhSachHangHoa) {
            if (hh.getMaHang().equals(hangHoa.getMaHang())) {
                System.out.println("Mã hàng đã tồn tại.");
                return false;
            }
        }
        danhSachHangHoa.add(hangHoa);
        System.out.println("Thêm hàng hóa thành công.");
        return true;
    }

    // In toàn bộ danh sách hàng hóa
    public void inDanhSachHangHoa() {
        if (danhSachHangHoa.isEmpty()) {
            System.out.println("Danh sách hàng hóa trống.");
        } else {
            for (HangHoa hh : danhSachHangHoa) {
                System.out.println(hh.toString() + ", VAT: " + hh.tinhVAT());
            }
        }
    }

    // Đánh giá mức độ bán buôn của từng hàng hóa
    public void danhGiaHangHoa() {
        for (HangHoa hh : danhSachHangHoa) {
            System.out.println(hh.toString());
            System.out.println("Đánh giá: " + hh.danhGiaMucDoBanBuon());
        }
    }
}
