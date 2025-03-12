import java.util.ArrayList;

public class RotatedArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={2,1,3,4};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                index=i;
                break;
            }
        }
        for(int i=index+1;i<=nums.length-1;i++){
            ls.add(nums[i]);
        }
        for(int i=0;i<=index;i++){
            ls.add(nums[i]);
        }
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)>ls.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
