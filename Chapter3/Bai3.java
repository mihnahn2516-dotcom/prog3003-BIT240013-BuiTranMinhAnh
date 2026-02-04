/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Bai3 {
    public static void main(String[] args) {
        CompletableFuture<String> future =
            CompletableFuture
                .supplyAsync(() -> Arrays.asList(1, 2, 5, 3, 100))
                .thenApply(list -> list.stream()
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .collect(Collectors.toList()))
                .thenApply(result -> "Kết quả là: " + result);

        System.out.println(future.join());
    }
}

