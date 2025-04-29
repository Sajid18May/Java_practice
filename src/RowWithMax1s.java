public class RowWithMax1s {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        System.out.println(rowWithMax1s(arr));
    }
    public static int rowWithMax1s(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int rowMaxOnes=0;
        int rowIndex=-1;
        for (int i = 0; i < m; i++) {

            int firstOneIndex=lowerBoundOf1(arr[i]);
            if((n-firstOneIndex)>rowMaxOnes){
                rowMaxOnes=(n-firstOneIndex);
                rowIndex=i;
            }

        }
        return rowIndex;
    }
    private static int lowerBoundOf1(int[] arr){
        int lowerBound=arr.length;
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                lowerBound=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return lowerBound;
    }
}
