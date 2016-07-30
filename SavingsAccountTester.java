package hw2;
/**
 * This class is to test the methods of SavingsAccounts
 * @author Yuxuan
 *
 */
public class SavingsAccountTester {
	public static void main(String[] args) {
		SavingsAccount BankOfMom;
		BankOfMom = new SavingsAccount(1000, 0.1);
		BankOfMom.addInterest();
		double myBalance = BankOfMom.getBalance();
		System.out.println("My initial Balance is $"+myBalance);
		myBalance = BankOfMom.getBalance();
		System.out.println("After one year, the balance in my bank account is $"+myBalance);
		
	}
	

}
