package multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // Acquire the lock
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
            // Simulate some work
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " is executing.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Release the lock
            System.out.println(Thread.currentThread().getName() + " has released the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
