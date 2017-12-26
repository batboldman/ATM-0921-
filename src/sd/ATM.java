package sd;

/**
* <h1>ATM</h1>
* ATM is automate teller machine.
* The  ATM class implements ATM's information
* <p>
* 
* @author  Amartungalag

*/

public class ATM {
	private Bank bank;
	private Customer currentCustomer;
	private Account currentAccount;
	private String state;
	
	/**
	   * Get the bank.
	   * Use getBank() 
	   * @return Get the Bank.
	   */
	public Bank getBank() {
		return bank;
	}

	 /**
	   * Set the Bank.
	   * @param bank The Bank.
	   
	   */
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	/**
	   * Get the current customer of the ATM
	   * Use getCurrentCustomer() 
	   * @return Get the current customer id ..
	   */
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

	 /**
	   * Set the CurrentCustomer .
	   * @param currentCustomer The login user.
	   
	   */
	
	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
	
	
	/**
	   * Get the current account of the ATM
	   * Use getCurrentAccount() 
	   * @return Get the current customer account ..
	   */
	public Account getCurrentAccount() {
		return currentAccount;
	}

	 /**
	   * Set the CurrentAccount .
	   * @param currentCustomer The login user's account.
	   
	   */
	
	
	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}
	
	/**
	   * Get the state of the ATM
	   * Use getState() 
	   * @return Get the state of the ATM ..
	   */
	public String getState() {
		return state;
	}

	
	 /**
	   * Set the  .
	   * @param currentCustomer The login user.
	   
	   */
	
	public void setState(String state) {
		this.state = state;
	}


}
