package logical.numbers;

        // 1
        // 1 1
        // 1 1 1
        // 1 1 1 1

public class Number1 {

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++){
            for (int num = 0; num <=i; num++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
