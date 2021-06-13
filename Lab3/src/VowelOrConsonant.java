import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a character ");
		char ch = in.next().charAt(0);
		in.close();
		if(ch =='a' || ch =='e' || ch =='i' || ch == 'o' ||ch == 'u') {
			System.out.println("Given character is vowel");
		}
		else {
			System.out.println("Given character is consonant");
		}
	}

}
