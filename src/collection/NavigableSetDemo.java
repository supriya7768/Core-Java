package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {

        NavigableSet t = new TreeSet();
        t.add(2000);
        t.add(1000);
        t.add(3000);
        t.add(4000);
        t.add(5000);

        System.out.println(t);                   //[1000, 2000, 3000, 4000, 5000]
        System.out.println(t.ceiling(2500));  //3000
        System.out.println(t.floor(2500));    //2000
        System.out.println(t.lower(2500));    //2000
        System.out.println(t.higher(2500));   //3000
        System.out.println(t.pollFirst());       //1000
        System.out.println(t.pollLast());        //5000
        System.out.println(t.descendingSet());   //[4000, 3000, 2000]

        System.out.println(t);                   //[2000, 3000, 4000]
    }

}
