package logical.numbers;

            //2
            //2 4
            //2 4 6
            //2 4 6 8
            //2 4 6 8 10

public class Number33 {
    public static void main(String[] args) {

        for (int i =1; i<= 5; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(j*2 +" ");
            }
            System.out.println();
        }
    }
}
