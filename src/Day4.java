import java.util.Arrays;

public class Day4 {
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,8,5,3,4,2,35};
		Arrays.sort(arr);
		System.out.println("Largest element= "+arr[arr.length-1]);
	}
}
