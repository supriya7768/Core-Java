package logical.array;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 5, 4, 0, 4, 8, 6, 0, 5};
        int[] newArr = new int[arr.length];

        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
