package tuan7.bai3_GIAODICH;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ListGiaoDich {
    private List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public int tongSoLuongVang() {
        int tong = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichVang) {
                tong += gd.soLuong;
            }
        }
        return tong;
    }

    public int tongSoLuongTienTe() {
        int tong = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichTienTe) {
                tong += gd.soLuong;
            }
        }
        return tong;
    }

    public double trungBinhThanhTienTienTe() {
        double tongThanhTien = 0;
        int soLuongGiaoDichTienTe = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichTienTe) {
                tongThanhTien += gd.thanhTien();
                soLuongGiaoDichTienTe++;
            }
        }
        return soLuongGiaoDichTienTe > 0 ? tongThanhTien / soLuongGiaoDichTienTe : 0;
    }

    public void giaoDichDonGiaLonHon1Ty() {
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd.getDonGia() > 1_000_000_000) {
                System.out.println(gd);
            }
        }
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich gd : danhSachGiaoDich) {
            System.out.println(gd);
        }
    }

    public void nhapCungGiaoDich() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            themGiaoDich(new GiaoDichVang("GDV001", sdf.parse("01/09/2023"), 5000000, 10, "9999"));
            themGiaoDich(new GiaoDichVang("GDV002", sdf.parse("15/09/2023"), 10000000, 5, "SJC"));
            
            themGiaoDich(new GiaoDichTienTe("GDT001", sdf.parse("05/09/2023"), 23000, 1000, 1, "USD"));
            themGiaoDich(new GiaoDichTienTe("GDT002", sdf.parse("10/09/2023"), 27000, 500, 1, "Euro"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
