package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    //From java 21 List extend SequencedCollection which further extend Collection

    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.add("Java");
        l.add("Python");
        l.add( "PlSQL");
        //l.add(80, "React");    //This will give IndexOutOfBoundsException becoz only 3 elements are pressent here
        //l.get(8);              //This will give IndexOutOfBoundsException
       //l.set(80, "Ruby");       //This will give IndexOutOfBoundsException
       //l.set(3, "Ruby");       //This will give IndexOutOfBoundsException
        l.indexOf("React");      //-1
        l.indexOf("PlSQL");      //2
        //l.remove(5);       //This will give IndexOutOfBoundsException


        System.out.println(l);

    }
}
