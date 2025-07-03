package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);

        ListIterator listIterator = l.listIterator();

        System.out.println(listIterator.hasPrevious());       //false
        //System.out.println(listIterator.previous());         //NoSuchElementException
        System.out.println(listIterator.previousIndex());      //-1
        System.out.println(listIterator.hasNext());           //true
        System.out.println(listIterator.next());              //5
        System.out.println(listIterator.nextIndex());         //1

        listIterator.add(10);
        System.out.println(l);                               //[5,10,6,7,8]

        listIterator.set(12);
        System.out.println(l);


    }
}
