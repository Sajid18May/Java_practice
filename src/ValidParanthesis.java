import java.util.Stack;

public class ValidParanthesis {
        public boolean isValid(String s) {
            char[] cArr=s.toCharArray();
            Stack<Character> sc=new Stack<>();
            if(cArr.length%2!=0)
                return false;
            for(char c:cArr){
                if(c=='('||c=='{'||c=='[')
                    sc.push(c);
                else if(!sc.isEmpty() && c==')'&& sc.peek()=='(')
                    sc.pop();
                else if(!sc.isEmpty() && c=='}'&& sc.peek()=='{')
                    sc.pop();
                else if(!sc.isEmpty() && c==']'&& sc.peek()=='[')
                    sc.pop();
                else
                    return false;
            }
        return sc.isEmpty();
        }


    public static void main(String[] args) {
        String s="({}][)";
        ValidParanthesis v=new ValidParanthesis();
        System.out.println(v.isValid(s));

    }
}
