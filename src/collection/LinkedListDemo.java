package collection;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("Supriya");
        l.add(1);
        l.add(true);
        l.add(1);
        l.add('a');

        System.out.println(l);

        LinkedList l1 = new LinkedList<>();
        l1.add("Java");
        l1.add("Python");
        l1.add("C++");

        l1.addFirst("Ruby");
        l1.addLast("Typescript");

        l1.size();
        l1.contains("Java1");
        int python = l1.indexOf("Python");


        //l1.clear();

        System.out.println(l1);

    }
}
