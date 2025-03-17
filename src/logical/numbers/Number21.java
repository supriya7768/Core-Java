package logical.numbers;

            //1 3 5 7
            //3 5 7 9
            //5 7 9 11
            //7 9 11 13

public class Number21 {
    public static void main(String[] args) {

        for (int i = 1; i <=8; i++){
            int num = i;
            for (int j = 1; j<=4; j++){
                System.out.print(num + " ");
                num = num +2;
            }
            num = i++;
            System.out.println();
        }
    }
}
