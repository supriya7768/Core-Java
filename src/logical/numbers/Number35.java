package logical.numbers;

//                    1
//                    3 5
//                    7 9 11
//                    13 15 17 19
//                    21 23 25 27 29

public class Number35 {

    public static void main(String[] args) {
        int num =1;
        for (int i = 0; i<=5 ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = num + 2;
            }
            System.out.println();

        }
    }
}
