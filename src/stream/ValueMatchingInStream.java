package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ValueMatchingInStream {

    public static void main(String[] args) {
        person p1=new person(33,"West Bengal");
        person p2=new person(31,"Kerala");
        person p3=new person(28,"Karnataka");
        person p4=new person(23,"Odisha");
        person p5=new person(25,"Bihar");
        person p6=new person(26,"Bihar");

        List<person> people= Arrays.asList(p1,p2,p3,p4,p5,p6);
        System.out.println(people.stream().anyMatch(p->p.state.equals("kashmir")));

        final Optional<person> max = people.stream().max(Comparator.comparing(p -> p.age));
        System.out.println(max);
        final Optional<person> min = people.stream().min(Comparator.comparing(p->p.age));
        System.out.println(min);

        final Double avg = people.stream().collect(Collectors.averagingInt(p->p.age));
        System.out.println(avg);

        System.out.println(people.stream().collect(Collectors.groupingBy(p->p.state.equals("Bihar"))));

        System.out.println(people.stream().noneMatch(p->p.state.equals("kashmir")));

        System.out.println(people.stream().allMatch(p->p.state.equals("kashmir")));

        Optional<person> fp=people.stream().filter(p->p.state.equals("Bihar")).findAny();
        if(fp.isPresent())
            System.out.println(fp);

        final List<String> collect = people.stream().map(p -> p.state).collect(Collectors.toList());
        System.out.println(collect);
    }
}
class person{
    public int age;
    public String state;

    person(int age,String state){
        this.age=age;
        this.state=state;
    }

    @Override
    public String toString() {
        return STR."person{age=\{age}, state='\{state}'}";
    }
}
