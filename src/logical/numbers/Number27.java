package logical.numbers;

            //1 1 1 1 1
            //0 0 0 0 0
            //1 1 1 1 1
            //0 0 0 0 0
            //1 1 1 1 1

public class Number27 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print(i%2 + " ");
            }
            System.out.println();
        }
    }
}
