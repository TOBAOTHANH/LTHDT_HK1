package tuan3.bai8;

import java.util.Arrays;

public class DanhSachCD {
    private CD[] danhSach;
    private int soLuongCD;

    public DanhSachCD(int kichThuoc) {
        danhSach = new CD[kichThuoc];
        soLuongCD = 0;
    }

    public boolean themCD(CD cd) {
        if (soLuongCD >= danhSach.length) {
            System.out.println("Danh sách đã đầy, không thể thêm CD mới.");
            return false;
        }

        for (int i = 0; i < soLuongCD; i++) {
            if (danhSach[i].getMaCD() == cd.getMaCD()) {
                System.out.println("CD có mã " + cd.getMaCD() + " đã tồn tại.");
                return false;
            }
        }

        danhSach[soLuongCD] = cd;
        soLuongCD++;
        return true;
    }

    public int tinhSoLuongCD() {
        return soLuongCD;
    }

    public double tinhTongGiaThanh() {
        double tongGiaThanh = 0;
        for (int i = 0; i < soLuongCD; i++) {
            tongGiaThanh += danhSach[i].getGiaThanh();
        }
        return tongGiaThanh;
    }

    public void sapXepGiamTheoGiaThanh() {
        Arrays.sort(danhSach, 0, soLuongCD, (cd1, cd2) -> Double.compare(cd2.getGiaThanh(), cd1.getGiaThanh()));
    }

    public void sapXepTangTheoTuaCD() {
        Arrays.sort(danhSach, 0, soLuongCD, (cd1, cd2) -> cd1.getTuaCD().compareToIgnoreCase(cd2.getTuaCD()));
    }

    public void xuatDanhSachCD() {
        if (soLuongCD == 0) {
            System.out.println("Danh sách trống.");
        } else {
            for (int i = 0; i < soLuongCD; i++) {
                System.out.println(danhSach[i]);
            }
        }
    }
}

