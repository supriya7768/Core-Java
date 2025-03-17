package logical.numbers;

            // 1 2 3 4
            // 1 2 3 4
            // 1 2 3 4
            // 1 2 3 4

public class Number7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            int num = 1;
            for (int j = 1; j <=4; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
