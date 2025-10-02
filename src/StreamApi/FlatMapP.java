package StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapP {
    static void main() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );

        list.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println); // Output: A B C D

    }
}
