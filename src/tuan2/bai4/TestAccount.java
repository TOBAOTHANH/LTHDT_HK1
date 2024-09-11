package tuan2.bai4;

public class TestAccount {
	 public static void main(String[] args) {
	        Account account1 = new Account(123456789L, "Nguyen Van A", 1000);
	        Account account2 = new Account(987654321L, "Tran Thi B");

	        System.out.println(account1);
	        System.out.println(account2);

	        account1.deposit(500);

	        account1.withdraw(300, 5);

	        account1.applyInterest();

	        account1.transfer(account2, 200);

	        System.out.println(account1);
	        System.out.println(account2);
	    }
}
