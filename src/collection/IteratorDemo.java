package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();  // modification count = 0
        al.add(5);  // modification count = 1
        al.add(6);  // modification count = 2
        al.add(7);  // modification count = 3
        al.add(8);  // modification count = 4
        al.add(9);  // modification count = 5

        Iterator iterator = al.iterator();  // temporary count ~ modification count  so temporary count = 5

        while (iterator.hasNext()){
            Object next = iterator.next();
            if (next.equals(7)){
                System.out.println("al from while loop before remove: " + al);
                iterator.remove();
                System.out.println("al from while loop after remove: " + al);
            }
            al.remove(Integer.valueOf(9));
        }
        System.out.println(al);
    }
}
