package comparable_comparator;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet t = new TreeSet(new MyComparator());    //if we remove new MyComparator() output is [0, 5, 10, 15, 20]
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);

        System.out.println(t);

    }
}
