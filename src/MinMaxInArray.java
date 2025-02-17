public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr={25,5,8,23,66,34,12,54};
        int max=arr[0];
        int min=arr[0];
        for(int i:arr){
            if(max<i) {
                max = i;
            }
            if(min>i) {
                min = i;
            }
        }
        System.out.println("Maximum number in array: "+max);
        System.out.println("Minimum number in array: "+min);
    }
}
