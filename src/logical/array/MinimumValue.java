package logical.array;

public class MinimumValue {

    public static void main(String[] args) {
        int[] num = {4,5,3,8,9,1};
        int minimum = num[0];

        for(int i = 0; i < num.length; i++){
            if(num[i] < minimum){
                minimum = num[i];
            }
        }
        System.out.println(minimum);
    }
}
