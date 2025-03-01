package multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable{

    String name;

    public PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " job started by Thread : " + Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        System.out.println(name + " job completed by Thread : " + Thread.currentThread().getName());
    }
}

class ExecutorDemo{
    public static void main(String[] args) {
        PrintJob[] jobs = {
                          new PrintJob("Supriya"),
                          new PrintJob("Ram"),
                          new PrintJob("Shiva"),
                          new PrintJob("Suresh"),
                          new PrintJob("Anil"),
                          new PrintJob("Pavan")
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job : jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}