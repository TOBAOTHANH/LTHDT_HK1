package tuan3.bai7;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        SinhVien[] danhSachSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");

            System.out.print("Mã sinh viên: ");
            int maSinhVien = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();

            System.out.print("Số điện thoại (7 chữ số): ");
            String soDienThoai = scanner.nextLine();

            danhSachSinhVien[i] = new SinhVien(maSinhVien, hoTen, diaChi, soDienThoai);
        }

        Arrays.sort(danhSachSinhVien, (sv1, sv2) -> Integer.compare(sv1.getMaSinhVien(), sv2.getMaSinhVien()));

        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo mã sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }

        scanner.close();
    }
}
