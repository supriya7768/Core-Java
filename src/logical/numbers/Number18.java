package logical.numbers;

//    4 5 12 13
//    3 6 11 14
//    2 7 10 15
//    1 8 9 16

public class Number18 {

    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i <= 4; i++){
            int num = i;
            int num2 = row - i + 1;
            for (int j = 1; j <= 4 ; j++){
                if (j % 2 == 0){
                    System.out.print(num + " ");
                }else{
                    System.out.print(num2 + " ");
                }
                num = num  + row;
                num2 = num2  + row;
            }
            System.out.println();
        }
    }
}
