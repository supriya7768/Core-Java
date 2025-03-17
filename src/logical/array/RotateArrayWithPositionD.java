package logical.array;

import java.util.Arrays;

public class RotateArrayWithPositionD {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 3;
        int[] temp = new int[arr.length];
        int[] temp1 = new int[temp.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (i >= d) {
                temp[index] = arr[i];
                index++;
            }else{
                temp1[i] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if(i < d){
                temp[index] = temp1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
