package multithreading.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo extends Thread{

    static ReentrantLock l = new ReentrantLock();

    @Override
    public void run() {
        if (l.tryLock()){
            System.out.println(Thread.currentThread().getName() + " got lock and performing safe operations");
            try{
                Thread.sleep(4000);
            }catch (InterruptedException e){
                l.unlock();
            }
        }else {
            System.out.println(Thread.currentThread().getName() + " unable to get lock and hence performimg alternative operations");
        }
        }

    public static void main(String[] args) {
        TryLockDemo t1 = new TryLockDemo();
        TryLockDemo t2 = new TryLockDemo();

        t1.start();
        t2.start();
    }
    }

