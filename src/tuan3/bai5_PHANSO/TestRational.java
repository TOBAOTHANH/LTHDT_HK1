package tuan3.bai5_PHANSO;

public class TestRational {
	public static void main(String[] args) {
        Rational fraction1 = new Rational(2, 3);
        Rational fraction2 = new Rational(4, 5);

        System.out.println("Phân số 1: " + fraction1);
        System.out.println("Phân số 2: " + fraction2);

        Rational sum = fraction1.add(fraction2);
        System.out.println("Tổng: " + sum);

        Rational difference = fraction1.subtract(fraction2);
        System.out.println("Hiệu: " + difference);

        Rational product = fraction1.multiply(fraction2);
        System.out.println("Tích: " + product);

        Rational quotient = fraction1.divide(fraction2);
        System.out.println("Thương: " + quotient);

        Rational reciprocal1 = fraction1.reciprocal();
        System.out.println("Nghịch đảo của phân số 1: " + reciprocal1);

        boolean isEqual = fraction1.equals(fraction2);
        System.out.println("Phân số 1 và Phân số 2 có bằng nhau không? " + (isEqual ? "Có" : "Không"));
    }
}
