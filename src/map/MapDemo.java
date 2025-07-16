package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

       HashMap h = new HashMap();
       h.put(1, "Java");
       h.put(2, "Angular");
       h.put(3, "React");
       h.put(3, "Ruby");           //Here 3 will be Ruby not React and will return React

        System.out.println(h);

        System.out.println(h.values());                      //[Java, Angular, Ruby]
        System.out.println(h.get(2));                        //Angular
        System.out.println(h.containsKey(5));                //false
        System.out.println(h.containsValue("Ruby"));         //true
        System.out.println(h.get(7));                        //null
        System.out.println(h.isEmpty());                     //false
        System.out.println(h.remove(3));                //Ruby
        System.out.println(h.size());                        //2
        System.out.println(h.remove(8));                //null
        h.replace("Angular", "React");
        System.out.println(h);                               //{1=Java, 2=Angular}
        System.out.println(h.replace("Reactt", "Angular"));  //null

    }
}
