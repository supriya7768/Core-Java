package multithreading.synchronization;

/*
   In this class as we are creating two objects for seat the threads will not work properly and will give
   wrong result.
   So to run this program correctly just add static to the synchronized method of Seat class.
   Also add static to the variable of seats.
 */

class MyThread1 extends Thread{
    Seat s;
    int seats;

    MyThread1(Seat s , int seats){
        this.s = s;
        this.seats=seats;
    }

    @Override
    public void run() {
        s.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    Seat s;
    int seats;

    MyThread2(Seat s , int seats){
        this.s = s;
        this.seats=seats;
    }

    @Override
    public void run() {
        s.bookSeat(seats);
    }
}

public class BookSeatStaticSync {

    public static void main(String[] args) {

        Seat s1 = new Seat();                              //object 1
        MyThread1 t1 = new MyThread1(s1, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(s1, 6);
        t2.start();

        Seat s2 = new Seat();                              //object 2
        MyThread2 t3 = new MyThread2(s2, 5);
        t3.start();

        MyThread2 t4 = new MyThread2(s2, 4);
        t4.start();
    }
}
