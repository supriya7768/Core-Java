package collection;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class DictionaryExample {
    public static void main(String[] args) {
        Dictionary<String, String> dict = new Hashtable<>();

        dict.put("India", "New Delhi");
        dict.put("USA", "Washington D.C.");
        dict.put("Japan", "Tokyo");

        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Country: " + key + ", Capital: " + dict.get(key));
        }
    }
}
