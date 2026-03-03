package ExTwo;
import java.util.*;
import java.util.concurrent.CompletableFuture;

public class bai2 {

    public static double calculateAverageGpa(List<Student> students) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0);
    }
