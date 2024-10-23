package tuan4.bai2_Sach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class ThuVien {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public void xuatDanhSach() {
        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }
    }

    public double tongThanhTienSachGiaoKhoa() {
        double tong = 0;
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa) {
                tong += ((SachGiaoKhoa) sach).tinhThanhTien();
            }
        }
        return tong;
    }

    public double tongThanhTienSachThamKhao() {
        double tong = 0;
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachThamKhao) {
                tong += ((SachThamKhao) sach).tinhThanhTien();
            }
        }
        return tong;
    }

    public double trungBinhDonGiaSachThamKhao() {
        double tongDonGia = 0;
        int count = 0;
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachThamKhao) {
                tongDonGia += sach.donGia;
                count++;
            }
        }
        return count > 0 ? tongDonGia / count : 0;
    }

    public void xuatSachGiaoKhoaTheoNXB(String nxb) {
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa && sach.getNhaXuatBan().equalsIgnoreCase(nxb)) {
                System.out.println(sach);
            }
        }
    }

    public static LocalDate convertToDate(String dateString) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dateString, dateFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ngày nhập không hợp lệ! Vui lòng nhập theo định dạng dd/MM/yyyy.");
            return null;
        }
    }
}
