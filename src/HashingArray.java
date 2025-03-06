public class HashingArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 7, 5, 6, 6, 7, 8, 8, 9, 9};
        int[] hash = hashingArray(arr);
        for(int i:hash){
            System.out.println(i);
        }
    }

    private static int[] hashingArray(int[] arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] hash=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        return hash;
    }
}
