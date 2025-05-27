package stream;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        List<Integer> ls=List.of(3,5,6,7,3,2,1);
        ls.stream().filter(i->i>3).forEach(i-> System.out.println(i));

    }
}
