package logical.star;

        //    *
        //   * *
        //  * * *
        // * * * *

public class Star2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
