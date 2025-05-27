package stream;

import java.util.List;

public class TransformWithMap {
    public static void main(String[] args) {
        List<String> names=List.of("Sajid","Mike","Ashok","Akash","Asif","Arman","Aman");
        names.stream().map(name->name.toUpperCase())
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);
    }
}
