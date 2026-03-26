
package ExThree;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Bai3 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "An", 900),
                new Employee(2, "Binh", 1200),
                new Employee(3, "Cuong", 1500),
                new Employee(4, "Dung", 800)
        );

        List<String> names = employees.stream()
                .filter(e -> e.getSalary() > 1000) // 1. lọc
                .map(Employee::getName)            // 2. lấy tên
                .sorted()                          // 3. sắp xếp alphabet
                .collect(Collectors.toList());     // 4. gom về List

        System.out.println(names);
    }
}
