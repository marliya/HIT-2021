package Lab6;

import java.util.Scanner;

public class BankAccountwithConstOverl {
	// TODO Auto-generated method stub
			public String customerName;
			public String accNo;
			public String accType;
			public float balance;
			public float depositAmount;
			
			public BankAccountwithConstOverl() {  //Constructor
				balance = 1000;
				System.out.println("Initial amount while creating account is "+balance);
			}
			
			public BankAccountwithConstOverl(int amount) {  //Constructor overloading
				balance = 1000;
				balance = balance + amount;
				System.out.println("Initial amount while creating account is "+balance);
			}
			
			public void CustDetail()
			{
				
				Scanner in = new Scanner(System.in);
				System.out.println("Enter customer name: ");
				customerName = in.next();
				accType = "Savings";
				System.out.println("Initial Amount is:"+balance);
				in.close();
				
				
			}
			public void deposit(float amount) {
				System.out.println("Balance before deposit amount is "+balance);
				balance +=amount;
				System.out.println("Current Balance "+balance);
			}
			public void PrintStatus() {
				
			System.out.println("Account Holder Name is "+customerName +" and account balance is : "+ balance);	
			}
			

		
			public static void main(String[] args) {
				BankAccountwithConstOverl obj1 = new BankAccountwithConstOverl(5000);
				obj1.CustDetail();
				obj1.deposit(5000);
				obj1.PrintStatus();
				
			
			
				
				
	}
}
