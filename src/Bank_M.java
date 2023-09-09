abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	 void getBalance() {
		 System.out.println("BankA Balance is 100$");
	 }
}
class BankB extends Bank{
	 void getBalance(){
		 System.out.println("BankB Balance is 140$");
 }
}
class BankC extends Bank{
	 void getBalance(){
		 System.out.println("BankC Balance is 200$");
 }
}
public class Bank_M {

	public static void main(String[] args) {
		Bank b1=new BankA();
		Bank b2=new BankB();
		Bank b3=new BankC();
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}

}
