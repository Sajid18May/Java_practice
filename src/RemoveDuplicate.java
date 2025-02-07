public class RemoveDuplicate {
    //Only applicable on Sorted array
    public static void main(String[] args) {
        int [] arr={1,2,2,6,6,6,7,17};
        RemoveDuplicate rd=new RemoveDuplicate();
        int[] nodup= rd.removeDuplicate(arr);
        System.out.println("Array after Duplicate removal");
        for(int i:nodup){
            System.out.print(i+" ");
        }
    }
    int[] removeDuplicate(int[] arr){
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]!=arr[i]){
                arr[index++ +1]=arr[i];
            }
        }
        int[] nodup=new int[index+1];
        for (int i=0;i<nodup.length;i++){
            nodup[i]=arr[i];
        }
       return nodup;
    }
}
