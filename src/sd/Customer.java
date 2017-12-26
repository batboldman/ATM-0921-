package sd;
import sd.Account;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
* <h1>Customer</h1>
* The Customer class implements customer's personal data 
* and provide account's information
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Amartungalag

*/


public class Customer {
	private static final ArrayList<Account> Account = null;
	private String name;
	private int customerNumber;
	private int pin;
	ArrayList<Account> accounts= new ArrayList<Account>();
	

	/**
	   * Get the account of the customer.
	   * Use getAccount() 
	   * @return Get the account of the customer.
	   */
	
	public static ArrayList<Account> getAccount() {
		return Account;
	} 

	/**
	   * Get the name of the customer.
	   * Use getName() 
	   * @return Get the name of the customer.
	   */
	
	public String getName() {
		return name;
	}

	 /**
	   * Set the name.
	   * @parameter name  The first name.
	   
	   */

	public void setName(String name) {
		this.name = name;
	}


	/**
	   * Get the Customer number of the customer. Customer Number is unique6
	   * Use getCustomerNumber() 
	   * @return Get the customer number of the customer.
	   */
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	 /**
	   * Set the Customer Number.
	   * @parameter customerNumber  The customer's id.
	   
	   */

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	   * Get the Pin of the customer's account. 
	   * Use getPin() 
	   * @return Get the customer's account pin number.
	   */
	

	public int getPin() {
		return pin;
	}

	 /**
	   * Set the account's pin number.
	   * @parameter pin  The customer's account pin.
	   
	   */

	public void setPin(int pin) {
		this.pin = pin;
	}

	 /**
	  This is constructor of Customer class. 
	  @param s are Name, CustomerNumber, PinCode
	   
	   */


	public Customer(String s , int i, int m ) {
		setName(" ");
		setCustomerNumber(0);
		setPin(0000);
	}



	 

}
