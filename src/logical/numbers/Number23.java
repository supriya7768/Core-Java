package logical.numbers;

//           1 0 1 0 1
//           0 1 0 1 0
//           1 0 1 0 1
//           0 1 0 1 0
//           1 0 1 0 1

public class Number23 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++){
            for (int j = 1; j <=5; j++){
                System.out.print((i+j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
