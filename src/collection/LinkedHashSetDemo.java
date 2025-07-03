package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet l = new LinkedHashSet();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(4);

        System.out.println(l);            //[1,2,3,4]

    }
}
