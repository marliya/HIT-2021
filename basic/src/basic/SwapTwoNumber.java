package basic;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 120,second = 200;
		System.out.println("--Before Swap--");
		System.out.println("First number "+first);
		System.out.println("Second number "+second);
		
		int temp = first;
		first = second;
		second = temp;
		System.out.println("--After swap--");
		System.out.println("first swap " + first);
		System.out.println("Second number "+second);
		

	}

}
