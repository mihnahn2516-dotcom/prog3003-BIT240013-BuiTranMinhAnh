package ExOne;
import java.util.*;
public class bai1 {
    
}

class Student {
    private final String id;
    private final String name;
    private final double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - GPA: " + gpa;
    }
}

class StudentManager<T> {
    private final List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public List<T> getAll() {
        return list;
    }
    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("01", "Lan Anh", 3.5));
        manager.add(new Student("02", "Trung Hiếu", 3.1));
        manager.add(new Student("03", "Anh Thu", 3.8));
        manager.add(new Student("04", "Minh Quang", 3.2));

        manager.getAll().forEach(System.out::println);
    }
}

