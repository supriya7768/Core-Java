package multithreading.synchronization;

public class BookSeat extends Thread {

    static Seat s;
    int seats;

    @Override
    public void run() {
       s.bookSeat(seats);
    }

    public static void main(String[] args) {

        s = new Seat();

        BookSeat john = new BookSeat();
        john.seats = 7;
        john.start();

        BookSeat alice = new BookSeat();
        alice.seats = 6;
        alice.start();
    }
}
