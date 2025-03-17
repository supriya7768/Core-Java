package logical.numbers;

            // 4 3 2 1
            // 4 3 2 1
            // 4 3 2 1
            // 4 3 2 1

public class Number9 {

    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--){
            int num = 4;
            for (int j = 4; j >= 1; j--){
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
