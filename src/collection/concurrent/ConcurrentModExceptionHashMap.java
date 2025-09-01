package collection.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModExceptionHashMap {

    public static void main(String[] args) {

        //HashMap m = new HashMap();                     // Uncommenting this line will cause a ConcurrentModificationException
        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(1, "Java");
        m.put(2, "Python");

        System.out.println(m);

        for(Object entry : m.entrySet()){
            m.put(3, "Ruby");
            System.out.println(entry);

        }
    }
}
