package multithreading.threadMethods;

/*
 interrupt()  ->  will throw exception and interrupt the thread
 interrupted()  -> will change the status of the interrupt from false to true
 isInterrupted() -> will not change the status, will show the status whether interrupted or not
*/

public class Interrupt extends Thread{

    @Override
    public void run() {

      //  System.out.println(Thread.interrupted());                      // If you comment t.interrupt() then it will provide false
        //  System.out.println(Thread.currentThread().isInterrupted());    // If you comment t.interrupt() then it will provide false

       // System.out.println(Thread.interrupted());       // Change the status of interrupt from false to true

        try {
            for (int i = 1; i<= 5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Thread interrupted : " + e);
        }
    }

    public static void main(String[] args) {

        Interrupt t = new Interrupt();
        t.start();
        t.interrupt();                           //This will provide Thread is interrupted exception
    }
}
