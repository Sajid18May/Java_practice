import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if (arr.length != arr2.length) {
            return false;
        }
        String a = new String(arr);
        String b = new String(arr2);

        if (a.equals(b)) {
            return true;
        }
        return false;
    }
}
