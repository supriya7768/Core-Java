package multithreading.threadMethods;
/*
Here main thread waits for child thread to complete after complete it then joins itself and complete its for loop
If we comment t.join() then both main and child will execute simultaneously and cant expect exact output
If we are not commenting then main thread calls join method on child object hence main thread will wait till completion of child thread
 */

public class Join extends Thread {
    @Override
    public void run() {
        for (int i =0; i<=100; i++){
            System.out.println("child thread");
            try {
              //  Thread.sleep(2000);
            }catch (Exception e){
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Join t = new Join();
        t.start();
        //t.join();
        //t.join(10000);     //Main thread will wait till 10 sec and then start main thread execution

        for (int i = 0; i<=10; i++){
            System.out.println("main thread");
        }
    }
}



// Waiting for child thread until completing main thread

class MyThread extends Thread{
    static Thread mt;

    @Override
    public void run() {
        try {
            mt.join();
        } catch (Exception e) {

        }
        for (int i =0; i<=10; i++) {
            System.out.println("Child thread");
        }
    }
}

class ThreadJoinDemo{

    public static void main(String[] args) throws InterruptedException {
        MyThread.mt = Thread.currentThread();
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i<=10; i++){
            System.out.println("Main thread");
            Thread.sleep(2000);
        }
    }
}
