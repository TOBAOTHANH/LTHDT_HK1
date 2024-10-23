package tuan7.bai8_HANGHOA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestHangHoa {
    public static void main(String[] args) throws ParseException {
        QuanLyHangHoa quanLy = new QuanLyHangHoa();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        HangThucPham hangThucPham1 = new HangThucPham("TP001", "Sữa tươi", 10, 15000, sdf.parse("01/01/2023"), sdf.parse("01/01/2024"), "Vinamilk");
        HangThucPham hangThucPham2 = new HangThucPham("TP002", "Bánh mì", 20, 5000, sdf.parse("05/09/2023"), sdf.parse("10/09/2023"), "ABC Bakery");

        HangDienMay hangDienMay1 = new HangDienMay("DM001", "Máy lạnh", 2, 10000000, 12, 1.5);
        HangDienMay hangDienMay2 = new HangDienMay("DM002", "Máy giặt", 5, 8000000, 24, 2.0);

        HangSanhSu hangSanhSu1 = new HangSanhSu("SS001", "Chén sứ", 100, 30000, "Minh Long", sdf.parse("10/09/2023"));
        HangSanhSu hangSanhSu2 = new HangSanhSu("SS002", "Bình hoa", 40, 50000, "Gốm Việt", sdf.parse("20/08/2023"));

        quanLy.themHangHoa(hangThucPham1);
        quanLy.themHangHoa(hangThucPham2);
        quanLy.themHangHoa(hangDienMay1);
        quanLy.themHangHoa(hangDienMay2);
        quanLy.themHangHoa(hangSanhSu1);
        quanLy.themHangHoa(hangSanhSu2);

        int choice;
        do {
            System.out.println("\n=== MENU QUẢN LÝ HÀNG HÓA ===");
            System.out.println("1. Thêm hàng thực phẩm");
            System.out.println("2. Thêm hàng điện máy");
            System.out.println("3. Thêm hàng sành sứ");
            System.out.println("4. In danh sách hàng hóa");
            System.out.println("5. Đánh giá hàng hóa");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã hàng: ");
                    String maHangThucPham = scanner.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHangThucPham = scanner.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTonThucPham = scanner.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGiaThucPham = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Nhập ngày sản xuất (dd/MM/yyyy): ");
                    Date ngaySanXuat = sdf.parse(scanner.nextLine());
                    System.out.print("Nhập ngày hết hạn (dd/MM/yyyy): ");
                    Date ngayHetHan = sdf.parse(scanner.nextLine());
                    System.out.print("Nhập nhà cung cấp: ");
                    String nhaCungCap = scanner.nextLine();

                    HangThucPham hangThucPham = new HangThucPham(maHangThucPham, tenHangThucPham, soLuongTonThucPham, donGiaThucPham, ngaySanXuat, ngayHetHan, nhaCungCap);
                    quanLy.themHangHoa(hangThucPham);
                    break;

                case 2:
                    System.out.print("Nhập mã hàng: ");
                    String maHangDienMay = scanner.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHangDienMay = scanner.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTonDienMay = scanner.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGiaDienMay = scanner.nextDouble();
                    System.out.print("Nhập thời gian bảo hành (tháng): ");
                    int thoiGianBaoHanh = scanner.nextInt();
                    System.out.print("Nhập công suất (KW): ");
                    double congSuat = scanner.nextDouble();

                    HangDienMay hangDienMay = new HangDienMay(maHangDienMay, tenHangDienMay, soLuongTonDienMay, donGiaDienMay, thoiGianBaoHanh, congSuat);
                    quanLy.themHangHoa(hangDienMay);
                    break;

                case 3:
                    System.out.print("Nhập mã hàng: ");
                    String maHangSanhSu = scanner.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHangSanhSu = scanner.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTonSanhSu = scanner.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGiaSanhSu = scanner.nextDouble();
                    scanner.nextLine(); // clear buffer
                    System.out.print("Nhập nhà sản xuất: ");
                    String nhaSanXuat = scanner.nextLine();
                    System.out.print("Nhập ngày nhập kho (dd/MM/yyyy): ");
                    Date ngayNhapKho = sdf.parse(scanner.nextLine());

                    HangSanhSu hangSanhSu = new HangSanhSu(maHangSanhSu, tenHangSanhSu, soLuongTonSanhSu, donGiaSanhSu, nhaSanXuat, ngayNhapKho);
                    quanLy.themHangHoa(hangSanhSu);
                    break;

                case 4:
                    System.out.println("\n=== DANH SÁCH HÀNG HÓA ===");
                    quanLy.inDanhSachHangHoa();
                    break;

                case 5:
                    System.out.println("\n=== ĐÁNH GIÁ HÀNG HÓA ===");
                    quanLy.danhGiaHangHoa();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
