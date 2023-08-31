
//import java.util.Arrays;
import java.util.Scanner;

public class ArrayDesending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int temp=0;
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Desending");
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
