package tuan2.bai4_NGANHANG;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    private static final double LAI_SUAT = 0.035;
    
    public Account() {
        this.accountNumber = 0;
        this.accountName = "No Name";
        this.balance = 0;
    }

    public Account(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return "Số tài khoản: " + accountNumber + 
               ", Tên tài khoản: " + accountName + 
               ", Số dư: " + currencyFormatter.format(balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp ti�?n thành công! Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số ti�?n nạp không hợp lệ.");
        }
    }

    public void withdraw(double amount, double fee) {
        if (amount + fee > balance) {
            System.out.println("Số ti�?n rút vượt quá số dư tài khoản.");
        } else if (amount <= 0) {
            System.out.println("Số ti�?n rút không hợp lệ.");
        } else {
            balance -= (amount + fee);
            System.out.println("Rút ti�?n thành công! Số dư hiện tại: " + balance);
        }
    }

    public void applyInterest() {
        balance += balance * LAI_SUAT;
        System.out.println("�?ã áp dụng lãi suất! Số dư hiện tại: " + balance);
    }

    public void transfer(Account toAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Số ti�?n chuyển không hợp lệ.");
        } else if (amount > balance) {
            System.out.println("Số ti�?n chuyển vượt quá số dư tài khoản.");
        } else {
            this.balance -= amount;
            toAccount.balance += amount;
            System.out.println("Chuyển khoản thành công! Số dư tài khoản nguồn: " + this.balance);
            System.out.println("Số dư tài khoản đích: " + toAccount.balance);
        }
    }
}
