public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};

        int sumCurrent=0,sumTarget=0;
        for(int i:arr){
            sumCurrent+=i;
        }
        for (int i=arr[0];i<=arr[arr.length-1];i++){
            sumTarget+=i;
        }
        System.out.println("Missing Number :"+(sumTarget-sumCurrent));
    }
}
