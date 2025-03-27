public class MaxProfit {
    public static void main(String[] args) {
        int[] arr={7,4,2,6,4};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        int maxP=0;
        int buy=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<buy){
                buy=i;
            }
            if((i-buy)>0){
                maxP=Math.max(maxP,(i-buy));
            }
        }
        return maxP;
    }
}
