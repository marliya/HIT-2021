import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,s;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		n =sc.nextLong();
		s =sum(n);
		System.out.println("Sum of digits is " +s);
		sc.close();

	}
	
	static int sum(long num) {
		int sum =0;
		while(num!=0)
		{
			sum +=num%10;
			num /=10;
		}
		return sum;
	}

}
