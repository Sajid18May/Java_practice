package stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class P1 {
    public static void main(String[] args) {
        int[] arr={4,8,6,1,3,2,9};
        Stream<Integer> sm =Stream.of(7,8,6,3,4,2,5,2)
                        .sorted((a,b)->b.compareTo(a));
        sm.forEach(System.out::println);
        System.out.println(Arrays.stream(arr).max());
        Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println(Arrays.stream(arr).count());

    }
}
