public class PalindromeChecker {
    static void main() {
        String text = "SASA";
        int number = 212;
        System.out.println(checkPalindromeString(text));
        System.out.println(checkPalindromeInteger(number));
    }

    private static String checkPalindromeString(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length()-1-i))
                return text + " is not Plaindrome";
        }
        return text + " is Palindrome";
    }
    private static String checkPalindromeInteger(int number){
        int rev=0,og=number;
        while(number>0) {
            int dig=number%10;
            rev=rev*10+dig;
            number/=10;
        }
        if(og!=rev)
            return og + " is not Palindrome";
        else
            return og + " is Palindrome";
    }
}
