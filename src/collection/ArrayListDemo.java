package collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add(1);
        l.add("Supriya");
        l.add(null);
        l.add("Supriya");
        l.add('a');
        l.add(true);                       // Heterogeneous, null allowed, duplicate allowed, insertion order
        l.addLast("OK");           //SequencedCollection method which came in Java 21 extend by List

        System.out.println(l);

        // Methods

        ArrayList l1 = new ArrayList();
        l1.add("Supriya");
        l1.add("Ravi");
        l1.add("Shiva");

        l1.add(2, "Ram");                 //This will add at specify index
        l1.addFirst("Sita");                    //This will add at first element (Method of SequencedCollection)
        l1.addLast("Laxman");                   //This will add at last element  (Method of SequencedCollection)
        l1.remove("Ravi");                           //This will remove the element from the list

        boolean contain = l1.contains("Supriya");       //This will check wether that element contains or not
        boolean empty = l1.isEmpty();                   //This will check if the list is empty
        Object first = l1.getFirst();                   //This will give the first element
        Object last = l1.getLast();                     //This will give the last element
        int size = l1.size();                           //This will give size of ArrayList

       // l1.clear();                                     //This will clear the list


        System.out.println(l1);
        System.out.println();
        System.out.println("Does the list contain element 'Supriya' : " + contain);
        System.out.println("Is list empty : " + empty);
        System.out.println("First element of list is : " + first);
        System.out.println("Last element of list is : " + last);
        System.out.println("Size of Arraylist is : "+ size);


        //ArrayList l3 = new ArrayList(-14);   //This will give IllegalArgumentException
    }

}
