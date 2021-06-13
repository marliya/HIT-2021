import java.util.Scanner;

public class SeasonCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of Month ");
		int month = in.nextInt();
		in.close();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Fall");
		}

	}

}
