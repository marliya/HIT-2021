
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "liril";
		String reversestr="";
		
		int strLength=str.length();
		for(int i=(strLength-1);i>=0;--i) {
			reversestr = reversestr +str.charAt(i);
			System.out.println(reversestr);
		}
		if(str.toLowerCase().equals(reversestr.toLowerCase())) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
			
		}

	}

}

