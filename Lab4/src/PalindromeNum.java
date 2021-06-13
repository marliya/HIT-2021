
public class PalindromeNum {

		
		public static void main(String[] args) {
			
	    int num =1221,rnum = 0,remainder;
		
		int originalNum=num;
		while(num!= 0) {
			remainder = num%10;
			rnum = rnum*10+remainder;
			num/=10;
		}
		if(originalNum ==rnum) {
			System.out.println(originalNum+" is a palindrome");
		}
		else {
			System.out.println(originalNum+" is not a palindrome");
			
		}
		}
	}




