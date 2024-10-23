package tuan8.bai2_QLPHONGHOC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc() {
        this.danhSachPhongHoc = new ArrayList<>();
    }

    public boolean themPhongHoc(PhongHoc phongHoc) {
        for (PhongHoc p : danhSachPhongHoc) {
            if (p.getMaPhong().equals(phongHoc.getMaPhong())) {
                return false; 
            }
        }
        danhSachPhongHoc.add(phongHoc);
        return true;
    }

    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc p : danhSachPhongHoc) {
            if (p.getMaPhong().equals(maPhong)) {
                return p;
            }
        }
        return null;
    }

    public void inDanhSachPhongHoc() {
        for (PhongHoc p : danhSachPhongHoc) {
            System.out.println(p);
        }
    }

    public void inDanhSachPhongDatChuan() {
        for (PhongHoc p : danhSachPhongHoc) {
            if (p instanceof PhongLyThuyet && ((PhongLyThuyet) p).datChuan()) {
                System.out.println(p);
            } else if (p instanceof PhongMayTinh && ((PhongMayTinh) p).datChuan()) {
                System.out.println(p);
            } else if (p instanceof PhongThiNghiem && ((PhongThiNghiem) p).datChuan()) {
                System.out.println(p);
            }
        }
    }

    public void sapXepTheoDayNha() {
        danhSachPhongHoc.sort(Comparator.comparing(PhongHoc::getDayNha));
    }

    public void sapXepTheoDienTichGiamDan() {
        danhSachPhongHoc.sort((p1, p2) -> Double.compare(p2.getDienTich(), p1.getDienTich()));
    }

    public void sapXepTheoSoBongDen() {
        danhSachPhongHoc.sort(Comparator.comparingInt(PhongHoc::getSoBongDen));
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        PhongHoc phong = timPhongHoc(maPhong);
        if (phong instanceof PhongMayTinh) {
            ((PhongMayTinh) phong).capNhatSoMayTinh(soMayTinhMoi);
            return true;
        }
        return false;
    }

    public boolean xoaPhongHoc(String maPhong) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn có chắc chắn muốn xóa phòng này không? (y/n)");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            return danhSachPhongHoc.removeIf(ph -> ph.getMaPhong().equals(maPhong));
        }
        return false;
    }

    public void inTongSoPhongHoc() {
        System.out.println("Tổng số phòng học: " + danhSachPhongHoc.size());
    }

    public void inPhongMayCo60May() {
        for (PhongHoc p : danhSachPhongHoc) {
            if (p instanceof PhongMayTinh && ((PhongMayTinh) p).getSoMayTinh() == 60) {
                System.out.println(p);
            }
        }
    }

	public String layTongSoPhongHoc() {
		// TODO Auto-generated method stub
		return null;
	}
}
