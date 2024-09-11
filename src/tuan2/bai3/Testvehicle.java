package tuan2.bai3;

import java.util.Scanner;

public class Testvehicle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle xe1 = null, xe2 = null, xe3 = null;
        int choice;

        do {
            System.out.println("Menu lựa chọn:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin cho xe1:");
                    xe1 = nhapThongTinXe(scanner);
                    System.out.println("Nhập thông tin cho xe2:");
                    xe2 = nhapThongTinXe(scanner);
                    System.out.println("Nhập thông tin cho xe3:");
                    xe3 = nhapThongTinXe(scanner);
                    break;
                case 2:
                    if (xe1 != null) xe1.displayInfo();
                    if (xe2 != null) xe2.displayInfo();
                    if (xe3 != null) xe3.displayInfo();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static Vehicle nhapThongTinXe(Scanner scanner) {
        System.out.print("Nhập tên xe: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();
        System.out.print("Nhập trị giá xe: ");
        double value = scanner.nextDouble();
        System.out.print("Nhập dung tích xylanh (cc): ");
        int engineCapacity = scanner.nextInt();
        return new Vehicle(name, value, engineCapacity);
    }
}
