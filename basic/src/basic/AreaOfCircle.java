package basic;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the radius :");
		double radius = scanner.nextDouble();
		double area = Math.PI * radius*radius;
		double circumference = Math.PI * 2*radius;
		System.out.println("Area is :"+area);
        System.out.println("Circumference is"+circumference);
        scanner.close();

	}

}
