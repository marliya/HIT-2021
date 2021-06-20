package Lab6;

public class ArithmeticOperation {
	
	public void arithOperation() {
		float s1 = 10.2f;
		float s2 = 5.0f;
		float  sub = s1-s2;
		System.out.println("subtraction is "+sub);
		
	}
	
	public int arithOperation(int s1,int s2,int s3,int s4) {
		int add = s1+s2+s3+s4;
		System.out.println( "sum of two number is "+add);
		return add;
	}
	public void arithOperation(int s1,int s2,int s3) {
		System.out.println("Product of two number is " + s1*s2*s3);
	}
	public void arithOperation(int s1,int s2) {
		float div = s1/s2;
		System.out.println("Division of %d and %d is "+div);
		
	}
	
public static void main(String[] args) {
	ArithmeticOperation obj1 = new ArithmeticOperation();
	obj1.arithOperation(12,10,3,4); //Addition
	obj1.arithOperation(2, 3, 4); //Multiplication
	obj1.arithOperation(10,2); //Division
	obj1.arithOperation();  //subtraction

}
}
