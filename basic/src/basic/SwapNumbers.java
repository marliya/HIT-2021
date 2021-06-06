package basic;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 120, second = 220;
		System.out.println("--Before swap--");
		System.out.println("First number "+first);
		System.out.println("Second Number "+second);
		
		first = first - second;
		second = first + second;
		first = second - first;
		
		System.out.println("--After swap--");
		System.out.println("first Number "+first);
		System.out.println("second Number "+second);

	}

}
