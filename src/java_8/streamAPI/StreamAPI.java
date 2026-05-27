package java_8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        /*
        Stream does ot store data collection store data
        Every stream has 3 parts : Source -> Intermediate Operation -> Terminal Operaion
        */

        List<String> names = Arrays.asList("Banana", "Apple", "Orange");
        names.stream()
                .filter(name -> name.startsWith("B"))     //Intermediate -> Returns n
                .map(String::toUpperCase)                       //Intermediate
                .forEach(System.out::println);                  //Terminal -> produce final result, execute

        /*
        Common operations :
        filter() -> Used to select elements baseed on condition
        map() -> transforms data
        distinct() -> remove duplicate
        sorted() -> sorting
        collect() -> Convert to collection
        reduce()
         */

        //Lazy Evaluation
        names.stream().filter(name -> {
            System.out.println("Filtering" + name);
            return name.startsWith("B");
        });
        //Nothing prints until terminal operation is evaluated

        //filter() ->remove data
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        nums.stream().filter(n -> n%2==0)
                .forEach(System.out::print);           //2 4

        System.out.println();

        //map() -> changes data
        nums.stream().map(n -> n*n)
                .forEach(System.out::print);           //1 4 9 16

        System.out.println();

        //Stream do not change original collection
        System.out.println(nums);                //[1, 2, 3, 4]

        //sorted() -> sort data
        List<Integer> number = Arrays.asList(5,3,6,2,1);
        number.stream().sorted().forEach(System.out::print);

        //distinct() ->remove duplicate
        List<Integer> number1 = Arrays.asList(1,1,2,2,2,3,5);
        number1.stream().distinct().forEach(System.out::print);  //1, 2, 3 5

        //collect() -> used to collect result back to Collection
        List<Integer> even = nums.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());

        //count() -> Count elements
        int count = nums.stream().filter(n -> n%2==0).count();
        System.out.println(count);

        //reduce()
    }
}
