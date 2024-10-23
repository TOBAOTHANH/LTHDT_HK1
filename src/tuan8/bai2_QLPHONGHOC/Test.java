package tuan8.bai2_QLPHONGHOC;

import java.util.Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLyPhongHoc qlph = new QuanLyPhongHoc();
        Scanner sc = new Scanner(System.in);

        qlph.themPhongHoc(new PhongLyThuyet("LT101", "A1", 50, 5, true));
        qlph.themPhongHoc(new PhongMayTinh("MT202", "B2", 45, 4, 60));
        qlph.themPhongHoc(new PhongThiNghiem("TN303", "C3", 70, 7, "Hóa học", 30, true));
        qlph.themPhongHoc(new PhongLyThuyet("LT102", "A2", 60, 6, false));

        int choice;
        do {
            System.out.println("\n---- MENU QUẢN LÝ PHÒNG HỌC ----");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm phòng học theo mã");
            System.out.println("3. In danh sách phòng học");
            System.out.println("4. In danh sách phòng đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách theo dãy nhà");
            System.out.println("6. Sắp xếp danh sách theo diện tích (giảm dần)");
            System.out.println("7. Sắp xếp danh sách theo số bóng đèn");
            System.out.println("8. Cập nhật số máy tính cho phòng máy");
            System.out.println("9. Xóa phòng học");
            System.out.println("10. In tổng số phòng học");
            System.out.println("11. In danh sách phòng máy có 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    themPhongHoc(qlph, sc);
                    break;
                case 2:
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maPhong = sc.nextLine();
                    PhongHoc phongHoc = qlph.timPhongHoc(maPhong);
                    if (phongHoc != null) {
                        System.out.println(phongHoc);
                    } else {
                        System.out.println("Không tìm thấy phòng học.");
                    }
                    break;
                case 3:
                    System.out.println("Danh sách phòng học:");
                    qlph.inDanhSachPhongHoc();
                    break;
                case 4:
                    System.out.println("Danh sách phòng đạt chuẩn:");
                    qlph.inDanhSachPhongDatChuan();
                    break;
                case 5:
                    qlph.sapXepTheoDayNha();
                    System.out.println("Danh sách sau khi sắp xếp theo dãy nhà:");
                    qlph.inDanhSachPhongHoc();
                    break;
                case 6:
                    qlph.sapXepTheoDienTichGiamDan();
                    System.out.println("Danh sách sau khi sắp xếp theo diện tích (giảm dần):");
                    qlph.inDanhSachPhongHoc();
                    break;
                case 7:
                    qlph.sapXepTheoSoBongDen();
                    System.out.println("Danh sách sau khi sắp xếp theo số bóng đèn:");
                    qlph.inDanhSachPhongHoc();
                    break;
                case 8:
                    System.out.print("Nhập mã phòng máy cần cập nhật: ");
                    maPhong = sc.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = sc.nextInt();
                    if (qlph.capNhatSoMayTinh(maPhong, soMayTinhMoi)) {
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy phòng máy hoặc không phải là phòng máy.");
                    }
                    break;
                case 9:
                    System.out.print("Nhập mã phòng cần xóa: ");
                    maPhong = sc.nextLine();
                    System.out.print("Bạn có chắc chắn muốn xóa phòng này không? (yes/no): ");
                    String xacNhan = sc.nextLine();
                    if (xacNhan.equalsIgnoreCase("yes")) {
                        if (qlph.xoaPhongHoc(maPhong)) {
                            System.out.println("Phòng học đã được xóa.");
                        } else {
                            System.out.println("Không tìm thấy phòng học.");
                        }
                    } else {
                        System.out.println("Hủy thao tác xóa.");
                    }
                    break;
                case 10:
                    System.out.println("Tổng số phòng học hiện tại: " + qlph.layTongSoPhongHoc());
                    break;
                case 11:
                    System.out.println("Danh sách phòng máy có 60 máy:");
                    qlph.inPhongMayCo60May();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }

        } while (choice != 0);
    }

    public static void themPhongHoc(QuanLyPhongHoc qlph, Scanner sc) {
        System.out.println("1. Thêm phòng lý thuyết");
        System.out.println("2. Thêm phòng máy tính");
        System.out.println("3. Thêm phòng thí nghiệm");
        System.out.print("Lựa chọn của bạn: ");
        int loaiPhong = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Nhập mã phòng: ");
        String maPhong = sc.nextLine();
        System.out.print("Nhập dãy nhà: ");
        String dayNha = sc.nextLine();
        System.out.print("Nhập diện tích (m2): ");
        double dienTich = sc.nextDouble();
        System.out.print("Nhập số bóng đèn: ");
        int soBongDen = sc.nextInt();
        sc.nextLine(); 

        switch (loaiPhong) {
            case 1:
                System.out.print("Phòng có máy chiếu không? (true/false): ");
                boolean coMayChieu = sc.nextBoolean();
                qlph.themPhongHoc(new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu));
                break;
            case 2:
                System.out.print("Nhập số máy tính: ");
                int soMayTinh = sc.nextInt();
                qlph.themPhongHoc(new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh));
                break;
            case 3:
                System.out.print("Nhập chuyên ngành: ");
                sc.nextLine(); 
                String chuyenNganh = sc.nextLine();
                System.out.print("Nhập sức chứa: ");
                int sucChua = sc.nextInt();
                System.out.print("Phòng có bồn rửa không? (true/false): ");
                boolean coBonRua = sc.nextBoolean();
                qlph.themPhongHoc(new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
