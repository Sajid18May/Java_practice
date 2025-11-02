package stream;

import java.util.Arrays;
import java.util.List;

public class ThirdLargest {
    static void main() {
        List<Integer> list = Arrays.asList(10, 5, 20, 20, 15, 30, 15, 25);

        int max = list.stream()
                .sorted()
                .skip(2)
                .limit(1)
                .getClass().getModifiers();
        System.out.println(max);
    }
}
