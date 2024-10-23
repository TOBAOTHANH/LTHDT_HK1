package tuan4.bai2_Sach;

import java.util.Scanner;

public class TestSach{
    public static void main(String[] args) {
        ThuVien thuVien = new ThuVien();
        Scanner scanner = new Scanner(System.in);

        // Thêm dữ liệu cứng
        thuVien.themSach(new SachGiaoKhoa("GK001", ThuVien.convertToDate("01/09/2022"), 50000, 100, "NXB Giáo Dục", "mới"));
        thuVien.themSach(new SachGiaoKhoa("GK002", ThuVien.convertToDate("15/05/2021"), 40000, 200, "NXB Trẻ", "cũ"));
        thuVien.themSach(new SachThamKhao("TK001", ThuVien.convertToDate("20/08/2023"), 100000, 50, "NXB Khoa Học", 10000));
        thuVien.themSach(new SachThamKhao("TK002", ThuVien.convertToDate("10/11/2020"), 80000, 30, "NXB Văn Hóa", 5000));

        // Hiển thị menu
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Xuất danh sách sách");
            System.out.println("2. Tính tổng thành tiền sách giáo khoa");
            System.out.println("3. Tính tổng thành tiền sách tham khảo");
            System.out.println("4. Tính trung bình đơn giá sách tham khảo");
            System.out.println("5. Xuất sách giáo khoa theo nhà xuất bản");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Xóa bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    thuVien.xuatDanhSach();
                    break;
                case 2:
                    System.out.println("Tổng thành tiền sách giáo khoa: " + thuVien.tongThanhTienSachGiaoKhoa());
                    break;
                case 3:
                    System.out.println("Tổng thành tiền sách tham khảo: " + thuVien.tongThanhTienSachThamKhao());
                    break;
                case 4:
                    System.out.println("Trung bình đơn giá sách tham khảo: " + thuVien.trungBinhDonGiaSachThamKhao());
                    break;
                case 5:
                    System.out.print("Nhập tên nhà xuất bản: ");
                    String nxb = scanner.nextLine();
                    thuVien.xuatSachGiaoKhoaTheoNXB(nxb);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
