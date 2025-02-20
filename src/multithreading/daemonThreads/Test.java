package multithreading.daemonThreads;

public class Test extends Thread{

    @Override
    public void run() {
        System.out.println("Child Thread");
        for (int i = 1; i<=50; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread");
        Test t = new Test();
        t.setDaemon(true);
        Thread.sleep(1000);
        System.out.println(t.isDaemon());
        t.start();
    }
}
