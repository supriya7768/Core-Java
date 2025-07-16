package map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

       // HashMap h = new HashMap();
        IdentityHashMap h = new IdentityHashMap();
        Integer i1 = Integer.valueOf(1000);
        Integer i2 = Integer.valueOf(1000);

        h.put(i1, "Java");
        h.put(i2, "Python");

        System.out.println(h);
    }
}
