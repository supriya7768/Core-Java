package logical.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEvenNumber {

    public static void main(String[] args) {
        RemoveEvenNumber r = new RemoveEvenNumber();
        r.m1();
        r.m2();
        r.m3();
        r.m4();
    }

    public void m1(){
        int[] num = {1, 2 , 3 , 4, 5, 6, 7, 8, 9};
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 != 0){
                result.add(num[i]);
            }
        }
        System.out.println(result);
    }

    public void m2(){
        int[] num = {1, 2 , 3 , 4, 5, 6, 7, 8, 9};
        int oddCount = 0;
        for(int i : num){
            if(i % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 != 0){
                result[index] = num[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public void m3(){
        int[] num = {1, 2 , 3 , 4, 5, 6, 7, 8, 9};
        int index = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 != 0){
                num[index] = num[i];
                index++;
            }
        }
        int[] result = Arrays.copyOf(num, index);
        System.out.println(Arrays.toString(result));
    }

    public void m4(){
        int[] num = {1,2,3,4,5,6,7,8,9};
        List<Integer> result = Arrays.stream(num)
                                    .filter(n -> n % 2 != 0)
                                    .boxed()
                                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
