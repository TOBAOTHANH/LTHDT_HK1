package tuan3.bai8_CD;

import java.util.Scanner;

public class TestCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DanhSachCD danhSachCD = new DanhSachCD(10);

        int luaChon;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm CD vào danh sách");
            System.out.println("2. Tính tổng số lượng CD");
            System.out.println("3. Tính tổng giá thành của các CD");
            System.out.println("4. Sắp xếp danh sách CD giảm dần theo giá thành");
            System.out.println("5. Sắp xếp danh sách CD tăng dần theo tựa CD");
            System.out.println("6. Xuất danh sách CD");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa ch�?n của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã CD: ");
                    int maCD = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nhập tựa CD: ");
                    String tuaCD = scanner.nextLine();

                    System.out.print("Nhập ca sĩ: ");
                    String caSy = scanner.nextLine();

                    System.out.print("Nhập số bài hát: ");
                    int soBaiHat = scanner.nextInt();

                    System.out.print("Nhập giá thành: ");
                    double giaThanh = scanner.nextDouble();

                    CD cd = new CD(maCD, tuaCD, caSy, soBaiHat, giaThanh);
                    danhSachCD.themCD(cd);
                    break;

                case 2:
                    System.out.println("Tổng số lượng CD: " + danhSachCD.tinhSoLuongCD());
                    break;

                case 3:
                    System.out.println("Tổng giá thành của các CD: " + danhSachCD.tinhTongGiaThanh());
                    break;

                case 4:
                    danhSachCD.sapXepGiamTheoGiaThanh();
                    System.out.println("Danh sách đã được sắp xếp giảm dần theo giá thành.");
                    break;

                case 5:
                    danhSachCD.sapXepTangTheoTuaCD();
                    System.out.println("Danh sách đã được sắp xếp tăng dần theo tựa CD.");
                    break;

                case 6:
                    danhSachCD.xuatDanhSachCD();
                    break;

                case 7:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("Lựa ch�?n không hợp lệ.");
                    break;
            }
        } while (luaChon != 7);

        scanner.close();
    }
}
