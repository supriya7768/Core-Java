package logical.array;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] num = {7, 4, 1, 8, 3, 9};
        int maximum = num[0];
        int secondMaximum = 0;
        for(int i = 0; i <num.length; i++){
            if(num[i] > maximum){
                secondMaximum = maximum;
                maximum = num[i];
            }
        }
        System.out.println(secondMaximum);

    }
}
