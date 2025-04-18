public class capacityToShipInDays {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    int day=5;
        System.out.println("Capacity to ship items :"+shipWithinDays(arr,day));
    }
    private static int countDays(int[] arr,int cap){
        int days = 1, weight = 0;
        for (int i : arr) {
            if (weight + i > cap) {
                days++;
                weight = i;
            } else {
                weight += i;
            }
        }
        return days;
    }
    private static int total(int[] arr){
        int total=0;
        for(int i:arr){
            total+=i;
        }
        return total;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        for (int w : weights) {
            maxWeight = Math.max(maxWeight, w);
        }

        int low = maxWeight;
        int high=total(weights);
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(countDays(weights,mid) <= days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
