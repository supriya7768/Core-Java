package logical.array;

public class MissingNumber {

    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6};

        for(int i = 0; i < num.length-1; i++){
            if(num[i+1] - num[i] != 1){
                int i1 = num[i] + 1;
                System.out.println(i1);
            }
        }
    }
}
