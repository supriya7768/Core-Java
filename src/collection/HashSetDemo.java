package collection;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet h = new HashSet();
        h.add("Java");                  //Heterogeneous allowed, insertion not preserved, null allowed only once
        h.add("Python");
        h.add("Ruby");
        h.add(1);
        h.add(null);
        h.add(null);                    // null can be inserted only once because no duplicate allowed
        System.out.println(h.add("Java"));
        System.out.println(h);         // [null, Java, 1, Ruby, Python]



    }
}
