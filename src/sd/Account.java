package sd;

/**
* <h1>Account</h1>
* The Account class implements an application that
* customer account's information
* <p>
* 
* @author  Amartungalag

*/
	
public class Account {
	private int balance;
	private int accountNumber;
	
	/**
	   * Get the Account balance.
	   * Use getBalance() 
	   * @return Get the account balance
	   */
	
	public int getBalance() {
		return balance;
	}
	 /**
	   * Set the Balance.
	   * @param balance The account's balance.
	   
	   */

	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	   * Get the Account Number.
	   * Use getAccountNumber() 
	   * @return Get the customer's account number
	   */
	
	public int getAccountNumber() {
		return accountNumber;
	}

	 /**
	   * Set the account number.
	   * @param accountNumber Customer's account number.
	   
	   */

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	 /**
     * The method used for Deposit refers to an amount of money in cash or check form or sent via a wire transfer that is placed into a bank account.
     * <p>
     * @param cash  The customer's capital
     */
	
	public void deposit(int cash){
		this.balance += cash;
	}
	
	
	 /**
     * The method used for taking out money or other capital.
     * <p>
     * @param cash  The customer's capital
     */
	 
	public void withdraw(int cash){
		this.balance -=cash;
	}
	
	 /**
     * Class constructor
     */

	public Account(int balance, int accnum) {
		setBalance(0);
		setAccountNumber(0);
	}
	
}
