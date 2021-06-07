package basic;

public class School {

		// TODO Auto-generated method stub
     int i = 10;
     void admission() {
    	 System.out.println("Admission done..");
     }
     int feesPayment(int money) {
    	 System.out.println("Accept money from you as fees");
    	 System.out.println("he returns the change..");
    	 if(money>500) {
    		 return money - 200;
    	 }
    	 else if (money < 500) {
    		 return money - 150;
    	 }
    	 else {
    		 return money -100;
    	 }
     }
     
     int askDonation(){
    	 return 100;
     }
     public static void main(String[] args) {
		School obj = new School();
		int money =obj.feesPayment(1000);
		System.out.println("Balance amount is "+money);
		
	}
     
     
	}


