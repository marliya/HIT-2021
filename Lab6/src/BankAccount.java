import java.util.Scanner;

public class BankAccount {
	

		// TODO Auto-generated method stub
		public String customerName;
		public String accNo;
		public String accType;
		public float balance;
		public float depositAmount;
		
		public BankAccount()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter customer name: ");
			customerName = in.next();
			accType = "Savings";
			balance =0;
			System.out.println("Initial Amount is:"+balance);
			
			
			
		}
		public void Deposit(float amount) {
			System.out.println("Balance before deposit amount is "+balance);
			balance +=amount;
			System.out.println("Balance amount is "+balance);
		}
		public void PrintStatus() {
			
		System.out.println("Account Holder Name is "+customerName +"and account balance is"+ balance);	
		}
		

	
		public static void main(String[] args) {
			BankAccount obj1 = new BankAccount();
			
			PrintStatus p = new PrintStatus();
		
			
			
}
}
