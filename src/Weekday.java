import java.util.Scanner;
public class Weekday {
	public static void main(String[] args) {
		System.out.println("Enter the number of day of the week");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		switch (d) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong Input value should be from 1 to 7");
		}
		sc.close();
	}

}
