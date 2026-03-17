package com.mycompany.luyentap8;
import java.util.*;

class Student {
    String mssv;
    String name;
    double gpa;

    public Student(String mssv, String name, double gpa) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "MSSV: " + mssv + ", Tên: " + name + ", GPA: " + gpa;
    }
}

public class StudentManager {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: showList(); break;
                case 3: searchByName(); break;
                case 4: deleteByMssv(); break;
                case 0: return;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    static void addStudent() {
        System.out.print("MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();

        list.add(new Student(mssv, name, gpa));
        System.out.println("Đã thêm!");
    }

    static void showList() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (Student s : list) {
            System.out.println(s);
        }
    }

    static void searchByName() {
        System.out.print("Nhập tên: ");
        String keyword = sc.nextLine().toLowerCase();

        for (Student s : list) {
            if (s.name.toLowerCase().contains(keyword)) {
                System.out.println(s);
            }
        }
    }

    static void deleteByMssv() {
        System.out.print("Nhập MSSV: ");
        String id = sc.nextLine();

        list.removeIf(s -> s.mssv.equals(id));
        System.out.println("Đã xóa nếu tồn tại!");
    }
}
