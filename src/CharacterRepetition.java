public class CharacterRepetition {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','f','t','e','d','d'};
        int[] hash = hashingCharacterArray(arr);
        for(int i:hash){
            System.out.println(i);
        }
    }

    private static int[] hashingCharacterArray(char[] arr) {
        int[] hash=new int[26];

        for (int i = 0; i < arr.length; i++) {
            int x=arr[i]-'a';//98-97=1
            hash[x]++;
        }


        return hash;
    }
}
