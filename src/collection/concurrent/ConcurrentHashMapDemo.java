package collection.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(101, "Java");
        m.put(102, "Python");
        m.put(103, "Ruby");
        m.putIfAbsent(103, "Angular");     //This will not be added as there is already key 103

        System.out.println(m);             //{101=Java, 102=Python, 103=Ruby}

        m.remove(101, "Python");           //This will not remove as in 101 value is Java
        m.remove(102, "Python");
        System.out.println(m);             //{101=Java, 103=Ruby}

        m.replace(103, "React", "Javascript");     //This will not replace as the old value is Ruby
        m.replace(103, "Ruby", "Javascript");
        System.out.println(m);                                           //{101=Java, 103=Javascript}



    }
}
