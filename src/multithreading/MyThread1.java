package multithreading;

public class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        Thread thread = new Thread(t);
        thread.start();
    }
}
