package java_8.methodRefereces;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Mayur", "Supriya", "Swami");

        //Lambda
        names.forEach(name -> System.out.println(name));

        //Method Reference
        names.forEach(System.out::println);
    }

    /*
    Types of Method reference:
    1. Reference to static method : ClassName :: staticMethod
    2.Reference to instance method : object :: instanceMethod
    3.Reference to a constructor : ClassName :: new
     */

    /*
    Lambda                              Method Reference

    x -> x.toUpperCase()                String :: toUpperCase
    () -> new ArrayList<>()             ArrayList :: new
    x -> System.out.println(x);         System.out::println
     */
}
