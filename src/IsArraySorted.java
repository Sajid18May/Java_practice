public class IsArraySorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        IsArraySorted a1=new IsArraySorted();
        System.out.println("Array sorted: "+a1.isSorted(arr));
    }
    public Boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
