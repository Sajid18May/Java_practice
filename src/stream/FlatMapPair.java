package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapPair {
    public static void main(String[] args) {
        // First list
        List<String> list1 = Arrays.asList("A", "B", "C");

        // Second list
        List<String> list2 = Arrays.asList("1", "2", "3");

        // Generate all possible pairs (Cartesian product)
        List<String> pairs =list1.stream()
                .flatMap(a -> list2.stream().map(b -> a + "-" + b))
                        .toList();
        // Print result
        System.out.println("All possible pairs:");
        pairs.forEach(System.out::println);

    }
}
