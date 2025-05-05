public class RemoveOuterPranthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuffer sb=new StringBuffer();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count>0){
                    sb.append(s.charAt(i));
                }
                count++;
            }
            else {
                count--;
                if(count>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
