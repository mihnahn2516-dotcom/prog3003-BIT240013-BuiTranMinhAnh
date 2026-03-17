
package com.mycompany.luyentap8;
import java.util.concurrent.*;

public class BankSystemAsync {

    public static void main(String[] args) {

        CompletableFuture<Boolean> authFuture = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            System.out.println("Xác thực...");
            return true; // đổi false để test lỗi
        });

        CompletableFuture<Boolean> balanceFuture = authFuture.thenApplyAsync(auth -> {
            if (!auth) throw new RuntimeException("Xác thực thất bại");
            sleep(2);
            System.out.println("Kiểm tra số dư...");
            return true; // đổi false để test lỗi
        });

        CompletableFuture<Void> transactionFuture = balanceFuture.thenAcceptAsync(balance -> {
            if (!balance) throw new RuntimeException("Không đủ tiền");
            sleep(2);
            System.out.println("Chuyển tiền thành công!");
        });

        transactionFuture.exceptionally(ex -> {
            System.out.println("Lỗi: " + ex.getMessage());
            return null;
        });

        transactionFuture.join();
    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

