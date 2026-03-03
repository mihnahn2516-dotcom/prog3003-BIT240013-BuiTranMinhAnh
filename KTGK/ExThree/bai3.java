package ExThree;
import java.util.*;

public class bai3 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(3.5),
                new Student(3.1),
                new Student(3.8),
                new Student(3.2));

        students.stream()
                .filter(s -> s.getGpa() >= 3.2)
                .sorted((a, b) -> Double.compare(b.getGpa(), a.getGpa()))
                .forEach(System.out::println);
    }
}

class Student {
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "GPA: " + gpa;
    }
}

