
public class LinerarSearchRecurcive {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 2, 3, 12, 33, 54 };
		int key = 12;
		System.out.println(searchRe(arr, key, arr.length-1));
	}

	private static int searchRe(int[] arr, int key, int index) {
		
		if (index == 0 && key != arr[index])
			return -1;
		
		if (key == arr[index])
			return index;
		
		return searchRe(arr, key, index - 1);
	}

}
