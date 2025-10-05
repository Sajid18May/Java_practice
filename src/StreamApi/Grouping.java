package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    static class Employee{
        private String name;
        private String department;
        private double salary;

        public Employee(String department, String name, double salary) {
            this.department = department;
            this.name = name;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 5000),
                new Employee("Jane", "HR", 4000),
                new Employee("Jack", "IT", 6000),
                new Employee("Doe", "HR", 4500)
        );

// Average salary by department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

// Employees by department
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
