package basic;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length :");
		double length = scanner.nextDouble();
		System.out.println("enter the width :");
		double width = scanner.nextDouble();
		
		double area = length * width;
		System.out.println("Area of rectangle is :"+area);
	    scanner.close();

	}

}
