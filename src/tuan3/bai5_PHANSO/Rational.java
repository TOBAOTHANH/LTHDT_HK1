package tuan3.bai5_PHANSO;

public class Rational {
	private int numerator;   
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); 
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) { 
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public Rational reciprocal() {
        return new Rational(denominator, numerator);
    }

    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational other) {
        return this.multiply(other.reciprocal());
    }

    public boolean equals(Rational other) {
        double tolerance = 0.0001;
        double difference = Math.abs((double)this.numerator / this.denominator - (double)other.numerator / other.denominator);
        return difference < tolerance;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
