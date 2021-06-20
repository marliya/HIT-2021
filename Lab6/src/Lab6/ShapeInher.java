package Lab6;

class Shape {
     public void display() {
    	 System.out.println("Display the function");
     }
}



class Square extends Shape{
	public void areaOfSquare(int a) {
		int area = a*a;
		System.out.println("Area of square is "+ area);
		
	}
}

class Perimeter extends Square{
	public void perimeterOfSquare(int a ) {
		int perimeter = 4*a;
		System.out.println("Area of rectange is "+ perimeter);
		
	}
}

public class ShapeInher{
	public static void main(String[] args) {
		Square obj1 = new Square();
		obj1.display();
		obj1.areaOfSquare(2);
	   
		
	}
	
}