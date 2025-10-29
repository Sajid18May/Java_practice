package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A simple record representing an Employees with a name and age.
 * Records are an elegant way to create immutable data carriers in Java (since Java 16).
 */
record Employees(String name, int age) {
    // Record body is empty as the constructor, getters, equals, hashCode, and toString are synthesized.
}

/**
 * Demonstrates how to group Employees objects into age range buckets
 * (e.g., "20-29", "30-39") using Java Streams and Collectors.groupingBy.
 */
public class EmployeeGroupingDemo {

    public static void main(String[] args) {
        // 1. Create a sample list of employees
        List<Employees> employees = List.of(
                new Employees("Alice", 25),
                new Employees("Bob", 33),
                new Employees("Charlie", 47),
                new Employees("David", 29),
                new Employees("Eve", 30),
                new Employees("Frank", 51),
                new Employees("Grace", 42),
                new Employees("Heidi", 20)
        );

        System.out.println("--- Original Employees List ---");
        employees.forEach(e -> System.out.println(e.name() + " (" + e.age() + ")"));
        System.out.println("\n------------------------------");

        // 2. Group employees by age range using a custom key mapper
        // The custom key mapper logic:
        // a. age / 10 -> truncates the age to the decade (e.g., 25/10 = 2)
        // b. (age / 10) * 10 -> gets the start of the decade (e.g., 2 * 10 = 20)
        // c. (age / 10) * 10 + 9 -> gets the end of the decade (e.g., 20 + 9 = 29)
        Map<String, List<Employees>> groupedByAgeRange = employees.stream()
                .collect(Collectors.groupingBy(e -> {
                    int age=e.age();
                    return age/10*10 + "-" + ((age/10)*10 + 9);
                }));

        // 3. Print the resulting grouped map
        System.out.println("--- Employees Grouped by Age Range ---");
        groupedByAgeRange.forEach((range, employeeList) -> {
            System.out.println("\nGroup: " + range);
            System.out.println("Count: " + employeeList.size());
            // Print names and ages for verification
            employeeList.forEach(e ->
                    System.out.println("  - " + e.name() + " (" + e.age() + ")")
            );
        });
        System.out.println("--------------------------------------");
    }
}