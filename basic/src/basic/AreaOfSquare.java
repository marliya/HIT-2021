package basic;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("enter the length :");

	   int side = scanner.nextInt();
	   
	   int area = side * side;
	   System.out.println("Area of the square is :"+area);
	   scanner.close();

	}

}
