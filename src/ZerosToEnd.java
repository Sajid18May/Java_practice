
public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr={2,4,5,1,0,7,0,8,3};
        zerosToEndOp(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void zerosToEndOp(int[] arr) {
        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
                j++;
            }
        }
    }

    private static void zerosToEndBrute(int[] arr) {
        int[] ze=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                ze[j]=arr[i];
                j++;
            }
        }
        while(j< ze.length){
            ze[j]=0;
            j++;
        }
        for (int i = 0; i < ze.length; i++) {
            arr[i]=ze[i];
        }
    }
}
