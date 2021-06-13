import java.util.Scanner;

public class PrintEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to start printing");
		int num1 = in.nextInt();	
		System.out.println("Enter the number to stop");
		int num2 = in.nextInt();	
		in.close();
		
		for(int i=num1;i<num2;i++) {
			if(i%2==0) {
				System.out.println("The even number in the series "+i);
					
			}
			else if(i ==num2) {
				System.out.println("Loop exits");
			}
		}
		
	}
}
