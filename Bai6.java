/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex6;

import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {

        int sum = Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
