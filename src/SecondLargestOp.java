import java.util.Arrays;

public class SecondLargestOp {
    public static void main(String[] args) {
        int[] arr={228 ,394, 463 ,227, 388, 757, 782, 238, 967};
        System.out.println(Arrays.toString(secondLargest(arr)));
        System.out.println(addElements(secondLargest(arr)));
    }

    private static int addElements(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    private static int[] secondLargest(int[] arr) {
        int[] maxEl=new int[2];
        int max=arr[0];
        int seMax=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                seMax=max;
                max=i;
            } else if (i<max && i>seMax) {
                seMax=i;
            }
        }
        maxEl[0]=max;
        maxEl[1]=seMax;
        return maxEl;
    }

}
