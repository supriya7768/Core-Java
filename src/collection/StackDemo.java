package collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.get(1));

        s.pop();
        s.peek();
        System.out.println(s.empty());
        System.out.println(s.search(6));         //-1

        System.out.println(s);

    }
}
