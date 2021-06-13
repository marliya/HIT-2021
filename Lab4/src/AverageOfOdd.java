
public class AverageOfOdd {

	public static void main(String[] args) {
		int sum=0;
		while(sum<10) {
		for(int i =0;i<10;i++) {
		 sum += 2*i + 1;
		 System.out.println(sum);
		}
		System.out.println("Average is:"+sum);

		System.out.println("Average is:"+(sum/10));
		
		}

}
}
