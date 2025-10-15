public class OccurrenceOfCharacter {
    static void main() {
        String value = "lieutenant";
        char c = 't';
        System.out.println("Occurrence of '"+c+"' in "+value+" is "+occurrenceOfChar(value,c));
        System.out.println("Occurrence of '"+c+"' in "+value+" is "+occurrenceOfCharStream(value,c));
    }

    private static int occurrenceOfChar(String value, char c) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if(c == value.charAt(i))
                count++;
        }
        return count;
    }
    private static int occurrenceOfCharStream(String value, char c) {

        return (int)value.chars()
                .filter(ch -> ch == c)
                .count();
    }

}
