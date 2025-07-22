package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("B");
        l.add("Y");
        l.add("M");
        l.add("O");

        //Sorting
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l, new MyComparator());
        System.out.println(l);

        //Binary Searching
        System.out.println(Collections.binarySearch(l, "N"));
        System.out.println(Collections.binarySearch(l, "N", new MyComparator()));

        //Reversing
        Collections.reverse(l);
        System.out.println(l);

        //Shuffle
        Collections.shuffle(l);
        System.out.println(l);

        Random r = new Random(1);
        Collections.shuffle(l, r);
        System.out.println(l);

        //Rotate
        Collections.rotate(l, 3);
        System.out.println(l);

        //Swaping
        Collections.swap(l, 4, 6);
        System.out.println(l);

    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
       return s1.compareTo(s2);
    }
}
