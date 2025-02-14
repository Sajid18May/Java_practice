package stringreverse;

public class StringReverse {
    public static void main(String[] args) {
        String str="Sajid";
        char[] cArr=str.toCharArray();
        for(int i=0,j=cArr.length-1;i<j;i++,j--){
            char temp=cArr[i];
            cArr[i]=cArr[j];
            cArr[j]=temp;
        }
        String s=new String(cArr);
        System.out.println(s);
    }
}
