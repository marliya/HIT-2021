package basic;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 3, exp = 4;
		long result = 1;
		while (exp != 0) {
			result *= base;
			--exp;
		
			
		}
		System.out.println("Answer = "+result);

	}

}
