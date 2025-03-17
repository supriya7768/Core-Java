package logical.array;

public class SumOfTwoArray {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int target = 5;

        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                int sum = num[i] + num[j];
                if(sum == target){
                    System.out.println(num[i] + " and " + num[j] + " = " + target);
                }
                break;
            }
        }
    }
}
