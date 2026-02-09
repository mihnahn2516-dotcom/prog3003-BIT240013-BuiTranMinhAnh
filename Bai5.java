/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Bai5 {
    public static void main(String[] args) {

        Supplier<Double> supplier = () -> Math.random() * 100;
        Consumer<Double> consumer =
                n -> System.out.println("Số may mắn: " + n);

        consumer.accept(supplier.get());
    }
}

