package multithreading.threadMethods;
/*
In this program, if we comment Thread.yield(); line than both threads will execute simultaneously and we cant expect which thread will execute first.
If we do not comment Thread.yield(); then child thread always call yield method because of that main method will get chance more number of times and the chance of completely main thread is high
 */
public class Yield extends Thread{

    @Override
    public void run() {
        for (int i = 0; i<=10 ; i++){
            System.out.println("Child Thread");
            Thread.yield();
       }
    }
    public static void main(String[] args) {
        Yield t = new Yield();
        t.start();

        for (int i =0; i<=100; i++){
            System.out.println("Main method");
        }
    }
}

