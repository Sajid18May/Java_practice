package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdLargest {
    static void main() {
        List<Integer> list = Arrays.asList(10, 5, 20, 20, 15, 30, 15, 25);

        Optional<Integer> max = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2) // 3. Skip the 1st and 2nd largest (index 0 and 1)
                .findFirst();
        System.out.println(max.get());
    }
}
