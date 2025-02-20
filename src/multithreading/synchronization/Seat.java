package multithreading.synchronization;

public class Seat {

    int total_seats = 10;

      //void bookSeat(int seats){
      synchronized void bookSeat(int seats){

        if (total_seats >= seats){
            System.out.println(seats + " seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println(total_seats + " seats are left");
        }else {
            System.out.println("Sorry seats cannot be booked....!");
            System.out.println("Seats left : " + total_seats);
        }

    }
}
