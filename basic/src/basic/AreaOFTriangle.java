package basic;

import java.util.Scanner;

public class AreaOFTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the base :");
        double base =scanner.nextDouble();
 	   System.out.println("enter the height :");
 	   double height = scanner.nextDouble();
 	   double area=(base * height)/2;
	   System.out.println("Area of triangle is :"+area);	
	   scanner.close();


	}

}
