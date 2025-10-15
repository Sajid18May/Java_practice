public class PalindromeChecker {
    static void main() {
        String text="SASA";
        System.out.println(checkPalindrome(text));
    }

    private static String checkPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length()-1-i))
                return text + " is not Plaindrome";
        }
        return text + " is Palindrome";
    }
}
