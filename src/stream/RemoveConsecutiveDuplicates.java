package stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveConsecutiveDuplicates {
    static void main(String[] args) {
        List<Integer> list =List.of(1, 1, 2, 3, 3, 3, 1, 4, 4, 5);

        List<Integer> noDupes = IntStream.range(0,list.size())
                .filter( i -> (i==0 || !list.get(i).equals(list.get(i-1))))
                        .mapToObj(list::get)
                                .toList();
        System.out.println(noDupes);
    }
}
