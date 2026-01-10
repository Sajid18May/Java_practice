package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class WordCount {
    static void main() {
        System.out.println(wordCount("Find a pin in a haystack"));
    }
    static HashMap<String,Integer> wordCount(String input){
        HashMap<String,Integer> output=new HashMap<>();
        String[] words=input.split("\\s+");
        System.out.println(Arrays.toString(words));
        for(String word:words){
            if(output.containsKey(word))
                output.put(word, output.get(word)+1);
            else
                output.put(word,1);
        }
        return output;

    }

}
