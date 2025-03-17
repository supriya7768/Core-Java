package logical.numbers;

            // 0
            // 1 2
            // 3 4 5
            // 6 7 8 9`

public class Number5{

    public static void main(String[] args) {

        int num = 0;
        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num = num +1;
            }
            System.out.println();
        }
    }
}
