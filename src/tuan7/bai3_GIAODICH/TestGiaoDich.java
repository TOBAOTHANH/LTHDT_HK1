package tuan7.bai3_GIAODICH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestGiaoDich {
    public static void main(String[] args) throws ParseException {
        ListGiaoDich qlGiaoDich = new ListGiaoDich();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        qlGiaoDich.nhapCungGiaoDich();

        int choice;
        do {
            System.out.println("=== QUẢN LÝ GIAO DỊCH ===");
            System.out.println("1. Thêm giao dịch vàng (nhập mềm)");
            System.out.println("2. Thêm giao dịch tiền tệ (nhập mềm)");
            System.out.println("3. Hiển thị danh sách giao dịch");
            System.out.println("4. Tính tổng số lượng giao dịch vàng");
            System.out.println("5. Tính tổng số lượng giao dịch tiền tệ");
            System.out.println("6. Tính trung bình thành tiền giao dịch tiền tệ");
            System.out.println("7. Xuất các giao dịch có đơn giá > 1 tỷ");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã giao dịch: ");
                    String maVang = scanner.nextLine();
                    System.out.print("Nhập ngày giao dịch (dd/MM/yyyy): ");
                    Date ngayVang = sdf.parse(scanner.nextLine());
                    System.out.print("Nhập đơn giá: ");
                    double donGiaVang = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int soLuongVang = scanner.nextInt();
                    scanner.nextLine(); // clear buffer
                    System.out.print("Nhập loại vàng: ");
                    String loaiVang = scanner.nextLine();
                    GiaoDichVang gdVang = new GiaoDichVang(maVang, ngayVang, donGiaVang, soLuongVang, loaiVang);
                    qlGiaoDich.themGiaoDich(gdVang);
                    System.out.println("Thêm giao dịch vàng thành công!");
                    break;

                case 2: 
                    System.out.print("Nhập mã giao dịch: ");
                    String maTienTe = scanner.nextLine();
                    System.out.print("Nhập ngày giao dịch (dd/MM/yyyy): ");
                    Date ngayTienTe = sdf.parse(scanner.nextLine());
                    System.out.print("Nhập đơn giá: ");
                    double donGiaTienTe = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int soLuongTienTe = scanner.nextInt();
                    System.out.print("Nhập tỷ giá: ");
                    double tiGia = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Nhập loại tiền tệ (VN/USD/Euro): ");
                    String loaiTienTe = scanner.nextLine();
                    GiaoDichTienTe gdTienTe = new GiaoDichTienTe(maTienTe, ngayTienTe, donGiaTienTe, soLuongTienTe, tiGia, loaiTienTe);
                    qlGiaoDich.themGiaoDich(gdTienTe);
                    System.out.println("Thêm giao dịch tiền tệ thành công!");
                    break;

                case 3: 
                    System.out.println("=== DANH SÁCH GIAO DỊCH ===");
                    qlGiaoDich.xuatDanhSachGiaoDich();
                    break;

                case 4: 
                    System.out.println("Tổng số lượng giao dịch vàng: " + qlGiaoDich.tongSoLuongVang());
                    break;

                case 5:
                    System.out.println("Tổng số lượng giao dịch tiền tệ: " + qlGiaoDich.tongSoLuongTienTe());
                    break;

                case 6: 
                    System.out.println("Trung bình thành tiền giao dịch tiền tệ: " + qlGiaoDich.trungBinhThanhTienTienTe());
                    break;

                case 7: 
                    System.out.println("=== GIAO DỊCH CÓ ĐƠN GIÁ > 1 TỶ ===");
                    qlGiaoDich.giaoDichDonGiaLonHon1Ty();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }
}
