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
        int index =0;
        for(int j=1;j<arr.length;j++){
            if(arr[index]!=arr[j]){
                arr[index++ +1]=arr[j];
            }
        }
        int[] nodup=new int[index +1];
        for (int i=0;i<nodup.length;i++){
            nodup[i]=arr[i];
        }
       return nodup;
    }
}
