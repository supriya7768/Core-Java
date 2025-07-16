package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue p = new PriorityQueue();

        System.out.println(p.peek());                   //null
        //System.out.println(p.element());                //NoSuchElementException

        p.offer(10);
        p.offer(1);
        p.offer(7);
        p.offer(5);

        System.out.println(p);                        //[1, 5, 7, 10]

        System.out.println(p.poll());
        System.out.println(p);
    }
}
