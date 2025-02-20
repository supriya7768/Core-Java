package multithreading.threadMethods;

public class Sleep extends Thread{

    @Override
    public void run() {
        for (int i = 1; i<=10; i++){
            try{
                Thread.sleep(2000);
                System.out.println(i);
            }catch (Exception e){
            }
        }
    }

    public static void main(String[] args) {
        Sleep t = new Sleep();
        t.start();
    }
}
