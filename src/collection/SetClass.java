package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Set <Employee> set1 = new HashSet<>();
        set1.add(new Employee(1, "Supriya"));
        set1.add(new Employee(1, "Supriya"));
        set1.add(new Employee(2, "Ganesh"));

        System.out.println(set1);

        Iterator itr1 = set1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next().hashCode());
        }

    }

    public void add(){
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }
}
