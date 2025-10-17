public class NumberOfWords {
    static void main() {
        String sentence = "Welcome to Kolkata";
        System.out.println("Numbers of words = "+ numbsOfWords(sentence));
    }
    private static int numbsOfWords(String sentence){
        String s=sentence.trim();
        int count=1;
        if(s.isEmpty())
            return 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                count++;
        }
        return count;
    }
}
