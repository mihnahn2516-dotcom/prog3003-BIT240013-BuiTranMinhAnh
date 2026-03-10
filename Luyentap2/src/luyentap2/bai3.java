import java.util.concurrent.CompletableFuture;

public class bai3 {

    public static void main(String[] args) {

        CompletableFuture<String> xacThuc = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println("Xác thực khách hàng xong");
            return "Done1";
        });

        CompletableFuture<String> xuatVe = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {}
            System.out.println("Xuất vé xem phim xong");
            return "Done2";
        });

        CompletableFuture<String> result =
                xacThuc.thenCombine(xuatVe, (a, b) -> "Hoàn thành hệ thống đặt vé");

        System.out.println(result.join());
    }
}
