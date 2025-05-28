package stream;

import java.util.List;

public class TransformingWithFlatmap {
    public static void main(String[] args) {
        List<String> names=List.of("Sajid","Mike","Ashok","Akash","Asif","Arman","Aman");
        List<String> country=List.of("India","USA","UK","Japan","Germany","France");
        List<List<String>> combo=List.of(names,country);
        combo.stream().flatMap(s->s.stream()).forEach(System.out::println);
    }
}
