class ReverseSentence {
    public static void main(String[] args) {
        String s="I love you";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");

        StringBuilder out = new StringBuilder();

        for (int i = str.length - 1; i > 0; i--) {
            out.append(str[i]).append(" ");
        }
        out.append(str[0]);
        return out.toString();
    }
}