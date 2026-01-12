package JavaPrograms;

public class PalindromeOrNot {
    static void main() {
        System.out.println(palindrome("555"));
    }
    static boolean palindrome(String word) {
        for(int i=0,j=word.length()-1;i<j;i++,j--){
            if(word.charAt(i)!=word.charAt(j))
                return false;
        }
        return true;
    }
}
