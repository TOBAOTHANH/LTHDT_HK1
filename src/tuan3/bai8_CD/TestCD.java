package tuan3.bai8_CD;

import java.util.Scanner;

public class TestCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DanhSachCD danhSachCD = new DanhSachCD(10); // Initialize list with a max size of 10

        int luaChon;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm CD vào danh sách (Nhập mềm)");
            System.out.println("2. Thêm CD vào danh sách (Nhập cứng với mảng 1 chiều)");
            System.out.println("3. Tính tổng số lượng CD");
            System.out.println("4. Tính tổng giá thành của các CD");
            System.out.println("5. Sắp xếp danh sách CD giảm dần theo giá thành");
            System.out.println("6. Sắp xếp danh sách CD tăng dần theo tựa CD");
            System.out.println("7. Xuất danh sách CD");
            System.out.println("8. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (luaChon) {
                case 1:  // Nhập mềm (User input)
                    System.out.print("Nhập mã CD: ");
                    int maCD = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

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

                case 2:  // Nhập cứng (Hard-coded with a 1D array)
                    // Declare and initialize a one-dimensional array of CDs
                    CD[] cdArray = {
                        new CD(201, "Album D", "Ca Sĩ D", 9, 180000),
                        new CD(202, "Album E", "Ca Sĩ E", 7, 130000),
                        new CD(203, "Album F", "Ca Sĩ F", 10, 250000)
                    };

                    // Loop to add each CD in the array to the danhSachCD
                    for (CD cdFromArray : cdArray) {
                        danhSachCD.themCD(cdFromArray);
                    }

                    System.out.println("Thêm nhập cứng từ mảng 1 chiều thành công 3 CD.");
                    break;

                case 3:
                    System.out.println("Tổng số lượng CD: " + danhSachCD.tinhSoLuongCD());
                    break;

                case 4:
                    System.out.println("Tổng giá thành của các CD: " + danhSachCD.tinhTongGiaThanh());
                    break;

                case 5:
                    danhSachCD.sapXepGiamTheoGiaThanh();
                    System.out.println("Danh sách đã được sắp xếp giảm dần theo giá thành.");
                    break;

                case 6:
                    danhSachCD.sapXepTangTheoTuaCD();
                    System.out.println("Danh sách đã được sắp xếp tăng dần theo tựa CD.");
                    break;

                case 7:
                    danhSachCD.xuatDanhSachCD();
                    break;

                case 8:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (luaChon != 8);

        scanner.close();
    }
}
