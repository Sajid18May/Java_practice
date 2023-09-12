import java.util.Scanner;

class Bank0 {
	void disp() {
		System.out.println("Bank name is SBI");
	}
}

interface Accounts {
	public static final int Balance = 80000;
	Scanner sc = new Scanner(System.in);

	void deposit();

	void withdraw();

	void calculate_interest();

	void view_balance();
}

class Current_Accounts implements Accounts {
	int balance1 = Balance;

	public void deposit() {
		System.out.println("Enter diposit ammount");
		int a = sc.nextInt();
		balance1 = balance1 + a;
		System.out.println("Current balance = " + balance1);
	}

	public void withdraw() {
		System.out.println("Enter withdraw ammount");
		int a = sc.nextInt();
		balance1 = balance1 - a;
		System.out.println("Current balance = " + balance1);
	}

	public void calculate_interest() {
		System.out.println("No interest");
	}

	public void view_balance() {
		System.out.println("Balance is " + balance1);
	}
}

class Savings_Accounts implements Accounts {
	int balance1 = Balance;

	public void deposit() {
		System.out.println("Enter diposit ammount");
		int a = sc.nextInt();
		balance1 = balance1 + a;
		System.out.println("Current balance = " + balance1);
	}

	public void withdraw() {
		System.out.println("Enter withdraw ammount");
		int a = sc.nextInt();
		balance1 = balance1 - a;
		System.out.println("Current balance = " + balance1);
	}

	public void calculate_interest() {
		double interest = 3.25;
		double i = balance1 * interest / 100;
		System.out.println("Inter after a year " + i);
	}

	public void view_balance() {
		System.out.println("Balance is " + balance1);
	}
}

public class Bank_System {

	public static void main(String[] args) {
		Bank0 b1 = new Bank0();
		b1.disp();
		Savings_Accounts s1=new Savings_Accounts();
		s1.deposit();
		s1.withdraw();
		s1.view_balance();
		s1.calculate_interest();
		Current_Accounts c1=new Current_Accounts();
		c1.deposit();
		c1.withdraw();
		c1.view_balance();
		c1.calculate_interest();
	}

}
