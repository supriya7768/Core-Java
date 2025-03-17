package logical.star;

        //       *
        //     * *
        //   * * *
        // * * * *

public class Star5 {

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++){
            for (int j = 3; j >= i; j--){
                System.out.print("  ");
            }
            for (int star = 0; star <= i; star++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
