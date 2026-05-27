package concepts;

import java.util.ArrayList;
import java.util.Arrays;

public class
Foreach {

    public static void main(String[] args) {
        Foreach foreach = new Foreach();
        foreach.example1();
        foreach.example2();
        example3();                    //Here using static method so no require of Object
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        example10();
    }

    /* Master Rule:
     1. Type must match -> int[] → int x ✅
                            String[] → String x ✅
     2. You cannot change original value -> x = copy ❌
     3. No index access -> System.out.println(i) ❌
     */


    public void example1(){
        String[] fruits = {"Apple", "Banana", "Orange"};      // Here fruit is a temp variable and we add fruits one by one then print and repeat
        for(String fruit : fruits){
            System.out.print("Example1 : " + fruit);          //Apple, Banana, Orange
            System.out.println();
        }
    }

    public void example2(){
        int[] numbers= {1,2,3,4};
        for(int num : numbers){
            System.out.print("Example2 : " + num);             //1,2,3,4
            System.out.println();
        }
    }

    // Sum of array
    public static void example3(){
        int[] number = {1,2,3,4};
        int sum = 0;
        for(int x : number){
            sum = x + sum;
        }
        System.out.println("Sum of array : " + sum);   //10
    }

    //Find maximum value
    public static void example4(){
        int[] number = {5, 3, 9, 6, 2};
        int max = number[0];
        for(int x : number){
            if(x > max){
                max = x;
            }
        }
        System.out.println("Maximum value : " + max);
    }

    //Count elements
    public static void example5(){
        int[] number = {1, 2, 3};
        int count = 0;
        for(int x : number){
            count++;
        }
        System.out.println("Total elements : " + count);
    }

    //Even Numbers
    public static void example6(){
        int[] number = {1, 2, 3, 4, 5, 6};
        for(int x : number){
            if(x % 2 == 0){
                System.out.print("Even number : " + x  + " ");
            }
        }
        System.out.println();
    }

    //Find word lengths
    public static void example7(){
        String[] words = {"Hi", "Hello", "World"};
        for (String word : words){
            System.out.print("Length of words : " + word.length());
        }
        System.out.println();
    }

    //Skip something using continue
    public static void example8(){
        int[] number = {1, 2, 3, 4,5};
        for(int num : number){
            if(num == 3){
                continue;
            }
            System.out.print("Skipping 3 : " + num);
        }
        System.out.println();
    }

    //Modify values
    public static void example9(){
        int[] number = {1, 2, 3};
        for(int num : number){
            num = num * 2;
            System.out.print("Trying to modify by foreach : " + Arrays.toString(number));   //Final array is stil same because num is just a copy not original box
            System.out.println();
        }
        //USe normal loop for this
        for(int i = 0; i < number.length; i++){
            number[i] = number[i] *2;
            System.out.print("Trying to modify by normal loop : " + Arrays.toString(number));
            System.out.println();
        }
    }

    //USing in ArrayList
    public static void example10(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String l : list){
            System.out.print("Arraylist : " + l);
        }
    }

}
