package logical.numbers;

                // 4 8 12 16
                // 3 7 11 15
                // 2 6 10 14
                // 1 5 9 13

public class Number19 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--){
            int num = i;
            for (int j = 1; j <= 4; j++){
                System.out.print(num + " ");
                num = num + 4;
            }
            System.out.println();
        }
    }
}
