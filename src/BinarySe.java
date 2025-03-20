import java.util.Scanner;

public class BinarySe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(binarySe(arr,key));
        sc.close();
    }

    private static int binarySe(int[] arr, int key) {
        int index=-1;
        int l=0,r=arr.length-1;
        while(l<=r){
          int mid=l+(r-l)/2;
          if(arr[mid]==key){
              index=mid;
              break;
          } else if (arr[mid]<key) {
              l=mid+1;
          }else{
              r=mid-1;
          }
        }
        return index;
    }
}
