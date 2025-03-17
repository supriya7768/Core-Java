package logical.numbers;

// 1 5 9 13
// 2 6 10 14
// 3 7 11 15
// 4 8 12 16

public class Number16 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            int num = i;
            for (int j =1; j <= 4; j++){
                System.out.print(num + " ");
                 num = num +4;
            }

            System.out.println();
        }
    }
}
