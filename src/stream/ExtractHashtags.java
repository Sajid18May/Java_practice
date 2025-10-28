package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractHashtags {
    static void main() {
        List<String> tweets = Arrays.asList(
                "Java Streams are #amazing! They simplify data processing.",
                "FlatMap is #powerful. It flattens collections.",
                "We have 10 new users and 5 #old ones.",
                "The #quick Brown fox jumps over the #lazy dog."
        );
        List<String> hashtag = tweets.stream()
                .flatMap(tweet->Arrays.stream(tweet.split(" ")))
                .filter(word->word.startsWith("#"))
                .distinct()
                .toList();
        System.out.println(hashtag);
    }
}
