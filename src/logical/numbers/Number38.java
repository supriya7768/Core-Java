package logical.numbers;


                //2
                //4 6
                //8 10 12
                //14 16 18 20
                //22 24 26 28 30

public class Number38 {

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for (int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
