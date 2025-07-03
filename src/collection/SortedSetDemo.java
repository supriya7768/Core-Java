package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet s = new TreeSet();

        s.add(101);
        s.add(102);
        s.add(103);
        s.add(104);
        s.add(105);
        s.add(100);

        System.out.println(s);

        System.out.println(s.first());       //100
        System.out.println(s.last());        //105
        System.out.println(s.headSet(103));      //[100,101, 102]
        System.out.println(s.tailSet(103));    //[103, 104, 105]
        System.out.println(s.subSet(102, 104));           //[102, 103]
    }
}
