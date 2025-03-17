package logical.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        r.m1();
        r.m2();
    }

    public void m1(){
        int[] num = {1,2,3,4,5};
        int[] reversed = new int[num.length];
        for(int i = 0; i < num.length; i++){
            reversed[i] = num[num.length-1-i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public void m2(){
        Integer[] num = {1,2,3,4,5};
        List<Integer> result = Arrays.asList(num);
        Collections.reverse(result);
        System.out.println(result);
    }
}
