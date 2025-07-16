package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap t = new TreeMap<>();
        t.put(100, "XXX");
        t.put(103, "YYY");
        t.put(90, "ZZZ");
        // t.put("AAA", 89);                         //ClassCastException

        System.out.println(t);

        TreeMap t1 = new TreeMap(new MyComparator());
        t1.put("XXX", 10);
        t1.put("AAA", 20);
        t1.put("ZZZ", 30);
        t1.put("LLL", 40);

        System.out.println(t1);

    }
}

class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }


}