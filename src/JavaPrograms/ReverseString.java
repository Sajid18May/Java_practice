package JavaPrograms;
public class ReverseString {
    static void main() {
        String s = "ReTry";
        System.out.println(ReverseString(s));
        System.out.println(ReverseStringArray(s));
    }

    static String ReverseString(String sample){
        StringBuilder reverse=new StringBuilder();
        for (int i = sample.length()-1; i >=0 ; i--) {
            reverse.append(sample.charAt(i));
        }
        return reverse.toString();
    }
    static String ReverseStringArray(String sample){
        char[] rev =sample.toCharArray();
        int l=0,r=sample.length()-1;
        while (l<r){
            char temp=sample.charAt(l);
            rev[l]=sample.charAt(r);
            rev[r]=temp;
            r--;
            l++;
        }
        return new String(rev);
    }
}
