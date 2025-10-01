package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    static void main() {
        List<Integer> numbers= Arrays.asList(1,8,3,6,9,6);
        for(Integer x:numbers)
            System.out.print(x);
        System.out.println(" ");
        numbers.forEach(System.out::print);
    }
}
