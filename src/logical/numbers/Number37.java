package logical.numbers;

                //1
                //3 2
                //6 5 4
                //10 9 8 7

public class Number37 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i<=4; i++){
            k = k+i;
            for (int j = 1; j<=i; j++){
                System.out.print(k + " ");
                k = k-1;
            }
            System.out.println();
            k= k+i;
        }
    }
}
