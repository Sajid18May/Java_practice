public class SumOfBeautyOfSubStrings {
    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }
    public static int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq=new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j)-'a']++;
                sum+=findBeauty(freq);
            }
        }
        return sum;
    }

    public static int findBeauty(int[] freq) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0){
                max = Math.max(max, freq[i]);
                min = Math.min(min, freq[i]);
            }
        }
        return max - min;
    }
}
