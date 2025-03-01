public class StringPalindromeRecursive {
    public static void main(String[] args) {
        boolean res=isPalindrome("WOW",0);
        System.out.println(res?"It's Palindrome":"It's not Palindrome");
    }

    private static boolean isPalindrome(String s,int i) {
        if(i>s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
        }else {
            return isPalindrome(s,i+1);
        }
    }
}
