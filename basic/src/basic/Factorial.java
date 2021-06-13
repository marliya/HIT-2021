package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ente rthe number : ");
		int num = scanner.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of entered number is : "+factorial);
		scanner.close();
				
	}
	static int fact(int n) {
		int output;
		if(n==1) {
			return 1;
		}
		//Recursive function
		
		output = fact(n-1)*n;
		return output;
		}
	

}
