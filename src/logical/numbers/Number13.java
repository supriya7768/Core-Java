package logical.numbers;

            // 1 2 3 4
            // 2 4 6 8
            // 3 6 9 12
            // 4 8 12 16

public class Number13 {
    public static void main(String[] args) {

        for (int i = 1 ; i <=4 ; i++){
            int num = 1;
            for (int j = 1; j <=4; j++){
                System.out.print(num * i + " ");
                num++;
            }
            System.out.println();
        }
    }
}
