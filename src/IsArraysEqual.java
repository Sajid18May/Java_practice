import java.util.Arrays;

public class IsArraysEqual {
    public static void main(String[] args) {
        int[] arrA={2,5,8,23,56,34,97,74};
        int[] arrB={2,5,8,23,56,34,97,74};
        int[] arrC={2,41,8,44,56,34,65,87};
        IsArraysEqual a=new IsArraysEqual();

        System.out.println(a.isArrayEqual(arrA,arrB));
        System.out.println(a.isArrayEqual(arrA,arrC));

        //with built-in method
        if(Arrays.equals(arrA,arrC)){
            System.out.println("These arrays are equal");
        }
        else {
            System.out.println("These arrays are not equal");
        }

    }
    public boolean isArrayEqual(int[] a,int[] b){

        if(a.length!=b.length) {
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) {
                return false;
            }
        }
        return true;
    }
}
