/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4;

import java.util.concurrent.*;

public class Bai4 {
    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
                CompletableFuture.runAsync(() -> {
                    sleep(1000);
                    System.out.println(" Kiểm tra sản phẩm hoàn thành");
                });

        CompletableFuture<Void> payment =
                CompletableFuture.runAsync(() -> {
                    sleep(1500);
                    System.out.println(" Thanh toán hoàn thành");
                });

        CompletableFuture<Void> shipping =
                CompletableFuture.runAsync(() -> {
                    sleep(2000);
                    System.out.println(" Vận chuyển hoàn thành");
                });

        CompletableFuture.allOf(checkProduct, payment, shipping).join();

        System.out.println(" Đơn hàng đã được xử lý hoàn tất!");
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

