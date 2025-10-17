
public class RemoveDuplicateCharacters {
    static void main() {
        String s="Saas";
        System.out.println(removeDuplicate(s));
    }

    private static String removeDuplicate(String s) {
        StringBuilder mod= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (mod.indexOf(String.valueOf(s.charAt(i))) == -1){
                mod.append(s.charAt(i));
            }
        }

        return mod.toString();
    }
}
