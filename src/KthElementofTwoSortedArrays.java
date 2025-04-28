import java.util.ArrayList;
import java.util.List;

public class KthElementofTwoSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> ls1=new ArrayList<>(List.of(1 ,2 ,3, 5, 6));
        int n=5;
        ArrayList<Integer> ls2=new ArrayList<>(List.of(4, 7 ,8 ,9 ,100));
        int m=5;
        int k=6;
        System.out.println(kthElement(ls1,ls2,n,m,k));
    }
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        if(m>n) kthElement(arr2,arr1,m,n,k);

        int low=Math.max(0,k-m),high=Math.min(k,n);
        int left=k;
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=left-mid1;

            int l1=(mid1>0)?arr1.get(mid1-1):Integer.MIN_VALUE;
            int l2=(mid2>0)?arr2.get(mid2-1):Integer.MIN_VALUE;
            int r1=(mid1<n)?arr1.get(mid1):Integer.MAX_VALUE;
            int r2=(mid2<m)?arr2.get(mid2):Integer.MAX_VALUE;
            if(l1 <=r2 && l2<= r1){
                return Math.max(l1,l2);
            } else if (l1 > r2) {
                high=mid1-1;
            }else {
                low=mid1+1;
            }
        }
        return 0;
    }
}
