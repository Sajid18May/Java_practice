import java.util.Arrays;

public class HasDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,4,2,5};
        System.out.println(hasDuplicates(arr));
    }

    private static boolean hasDuplicates(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
