package logical.numbers;

//        1
//        3 5
//        5 7 9
//        7 9 11 13
//        9 11 13 15 17

public class Number36 {
    public static void main(String[] args) {

        for (int i = 1; i<= 5; i++){
            int k = 2*i-1;
            for (int j = 1; j<=i; j++){
                System.out.print(k + " ");
                k = k+2;
            }
            System.out.println();

        }
    }
}
