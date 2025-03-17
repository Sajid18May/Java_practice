public class SellingStocks {
    public static void main(String[] args) {
            int[] arr={2,1,3,4};
            System.out.println(sellStock(arr));
    }

    private static int sellStock(int[] arr) {
        int maxProfit=0;
        int buy=arr[0];
        for (int i = 0; i < arr.length; i++) {
            int profit =arr[i]-buy;
            maxProfit=Math.max(maxProfit, profit);
            buy=Math.min(arr[i],buy);
        }

        return maxProfit;
    }
}
