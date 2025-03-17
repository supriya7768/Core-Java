package logical.numbers;

            //0 1 0 1 0
            //0 1 0 1 0
            //0 1 0 1 0
            //0 1 0 1 0
            //0 1 0 1 0

public class Number28 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 0; j<=4; j++){
                System.out.print(j%2 + " ");
            }
            System.out.println();
        }
    }
}
