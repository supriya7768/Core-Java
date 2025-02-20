package multithreading.interCommunication;

public class MovieBookApp {

    public static void main(String[] args) throws InterruptedException {

        TotalEarnings te = new TotalEarnings();
        te.start();
    //  System.out.println("Total earnings : " + te.total + " rupees");

        synchronized (te){
            te.wait(1000);

            System.out.println("Total earnings : " + te.total + " rupees");
        }
    }
}

class TotalEarnings extends Thread{

    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 1000000; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                total = total + 100;
            }
         //   this.notify();
        }
    }
}
