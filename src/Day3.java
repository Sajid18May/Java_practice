
public class Day3 {
public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		for(int k=0;k<=10-i;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			if(j==0||j==i||i==9)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
//   *
//  * *
// *   *
//*******