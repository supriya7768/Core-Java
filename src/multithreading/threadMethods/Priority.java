package multithreading.threadMethods;

/*
 MIN_PRIORITY = 1;
 NORM_PRIORITY = 5;   -->  default priority
 MAX_PRIORITY = 10;
 */

public class Priority extends Thread{

    @Override
    public void run() {
        System.out.println("Task");
        System.out.println("Task priority thread: " + Thread.currentThread().getPriority() );
    }

    public static void main(String[] args) {

        System.out.println("Main thread old priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("Main thread new priority : " + Thread.currentThread().getPriority());

        Priority t = new Priority();
        t.setPriority(3);
        t.start();

    }
}
