import java.util.TreeSet;

public class bai1 {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sách: " + names);

        System.out.println("Phần tử nhỏ nhất: " + names.first());
        System.out.println("Phần tử lớn nhất: " + names.last());
    }
}
