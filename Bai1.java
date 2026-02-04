/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;
class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}
class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable đang chạy...");
    }
}
public class Bai1 {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        Thread t2 = new Thread(new WorkerRunnable());

        t1.start();
        t2.start();
    }
}

