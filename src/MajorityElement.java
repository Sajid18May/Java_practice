import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=el2){
                el1=nums[i];
                count1=1;
            }
            else if(count2==0 && nums[i]!=el1){
                el2=nums[i];
                count2=1;
            }
            else if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]){
                count2++;
            }
        }
        if(count1>n/3){
            ls.add(el1);
        }
        if(count2>n/3){
            ls.add(el2);
        }

        return ls;
    }
}
