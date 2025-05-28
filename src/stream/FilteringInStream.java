package stream;

import java.util.List;

public class FilteringInStream {
    public static void main(String[] args) {
        List<String> names= List.of("Sajid","Mike","Ashok","Akash","Asif","Arman","Aman");
        names.stream().distinct().forEach(System.out::println);
        names.stream().limit(5).forEach(System.out::println);
        names.stream().skip(5).forEach(System.out::println);
    }
}
