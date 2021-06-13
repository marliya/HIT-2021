import java.util.Scanner;

public class PrimeNumForLoop {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		in.close();
		boolean flag =false;
		
		for(int i=2;i<=num/2;++i) {
			if(num%i == 0) {
				flag =true;
				break;
				
			}
		}
		
		if(!flag) {
			System.out.println(num +" is a prime number");
		
		}
		else{
			System.out.println(num + " is not a prime number");
		
		}
		
	}

}
