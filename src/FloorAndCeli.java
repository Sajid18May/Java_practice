import java.util.Arrays;

public class FloorAndCeli {
    public static void main(String[] args) {
        int[] arr={5, 6, 8, 9, 6, 5, 5, 6};
        int x=7;
        System.out.println(Arrays.toString(getFloorAndCeil(x,arr)));
    }
    public static int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=Integer.MIN_VALUE,celi=Integer.MAX_VALUE;
        int max=arr[0],min=arr[arr.length-1];
        for(int i:arr){
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }

        for(int i:arr){
            if(i<=x)
                floor=Math.max(floor,i);
            if(i>=x)
                celi=Math.min(celi,i);
        }
        if(x<min){
            floor=-1;
        }
        if(x>max){
            celi=-1;
        }

        return new int[]{floor,celi};
    }
}
