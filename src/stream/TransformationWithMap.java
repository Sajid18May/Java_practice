package stream;

import java.util.List;

public class TransformationWithMap {
    public static void main(String[] args) {
        List<String> names=List.of("Sajid","Mike","Ashok","Akash","Asif","Arman","Aman");
        names.stream().map(name->name.toUpperCase()+" "+name.toLowerCase())
                .forEach(System.out::println);
    }
}
