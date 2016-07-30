package hw2;
/**
 * This class models the properties of a saving account that allow deposition and 
 * interest growth
 * @author Yuxuan
 *
 */
public class SavingsAccount {
	private double balance;
	private double interest; 
	private double interestRate;
	
	/**
	 * Initialize the a Saving Account with zero balance.
	 */
	public SavingsAccount() {
		balance = 0;
	}
	/**
	 * Initialize an individual account with specified balance and interest rate
	 * @param initialBalance
	 * @param rate
	 */
	public SavingsAccount(double initialBalance, double rate) {
		this.balance = initialBalance;
		this.interestRate = rate;
	}
	/**
	 * Deposit money into the bank account
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	/**
	 * Calculate the interest and the remaining balance
	 */
	public void addInterest() {
		this.interest = this.balance * this.interestRate;
		this.balance = this.balance + this.interest;
	}
	/**
	 * Get the balance of the saving account
	 * @return
	 */
	public double getBalance() {
		return this.balance;
	}

}
