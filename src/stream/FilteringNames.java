package stream;

import java.util.List;

public class FilteringNames {
    public static void main(String[] args) {
        List<String> names=List.of("Sajid","Mike","Ashok","Akash","Asif","Arman","Aman");
        names.stream().filter(s->s.charAt(0)=='A').forEach(System.out::println);
    }
}
