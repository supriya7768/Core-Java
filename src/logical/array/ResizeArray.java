package logical.array;

import java.util.Arrays;

public class ResizeArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        arr = Arrays.copyOf(arr, 7);

        System.out.println(Arrays.toString(arr));
    }
}
