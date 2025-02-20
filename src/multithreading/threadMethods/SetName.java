package multithreading.threadMethods;

public class SetName extends Thread{

    @Override
    public void run() {
        System.out.println("Run method");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SetName t = new SetName();
        t.start();
        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Supriya");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isAlive());


    }
}
