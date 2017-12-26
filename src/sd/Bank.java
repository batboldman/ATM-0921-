package sd;
import sd.Customer;
import java.awt.List;
import java.util.ArrayList;

/**
* <h1>Bank</h1>
* The Bank class implements an application that
*bank's information
* <p>
* 
* @author  Amartungalag

*/

public class Bank {
	private String name;
	static ArrayList<Customer> customers = new ArrayList<Customer>();
	
	 /**
	   Class Constructor
	   */
	
	public Bank(String name) {
		// TODO Auto-generated constructor stub
		setName("");
	}
	
	/**
	   * Get the name of the Bank.
	   * Use getName() 
	   * @return Get the name of the Bank
	   */
	
	public String getName() {
		return name;
	}


	 /**
	   * Set the Bank's name.
	   * @parameter name  The Bank name.
	   
	   */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * This method is used to add customer to list.
     * <p>
     * @param c The customer  
     *    */

	public static void addCustomer(Customer c){
		customers.add(c);
	}
	
	/**
	   * Get the Customer.
	   * Use getCustomer() 
	   * @return Get the customers
	   */
	
	
	public ArrayList<Customer> getCustomer(int id){
	
       return customers;
			
	}	

}
