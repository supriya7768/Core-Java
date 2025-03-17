package logical.numbers;

// 1 1 1 2 1 3
// 2 1 2 2 2 3
// 3 1 3 2 3 3
// 4 1 4 2 4 3

public class Number15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 3; j++){
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
    }
}
