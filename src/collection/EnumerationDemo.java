package collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        Enumeration elements = v.elements();

        while(elements.hasMoreElements()){
            Object o = elements.nextElement();
            System.out.println(o);
        }


    }
}
