package collection;

import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args) {

        Hashtable h = new Hashtable<>();
        h.put(1, "Java");
        h.put(2, "Python");
        h.put(3, "Ruby");
        h.put(1, "Rust");
        //h.put(null, null);                //Null Pointer Exception


        System.out.println(h);

    }
}
