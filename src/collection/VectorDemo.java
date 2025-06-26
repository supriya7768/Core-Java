package collection;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        System.out.println(v);                  //[1,2,3,4]

        System.out.println(v.get(3));           //4
        //System.out.println(v.get(5));         //This will give ArrayIndexOutOfBoundsException
        System.out.println(v.capacity());       //10
        System.out.println(v.contains(5));      //false
        System.out.println(v.size());           //4
        System.out.println(v.remove(2));  //3
    }
}
