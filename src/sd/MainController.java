package sd;
import sd.Bank;
import java.util.Scanner;
import sd.Customer;
import sd.Account;
public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1= new Account(19,121212);
		Customer c1= new Customer("adas",000,223);
	
		c1.setName("Amaraa");
		c1.setPin(0225);
		c1.setCustomerNumber(01);
		
		a1.setAccountNumber(5034342);
		a1.setBalance(1000);
		
	
		
		Bank b1= new Bank("khaan");

		System.out.println("Account Number");
		Scanner input=new Scanner(System.in);
		int accNum=input.nextInt();
		
		
		
	}

}
