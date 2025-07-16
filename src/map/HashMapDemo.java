package map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap h = new HashMap();
        h.put(1, "Java");
        h.put(2, "Python");
        h.put(3, "Ruby");
        h.put(null, "JS");

        System.out.println(h);
    }
}
