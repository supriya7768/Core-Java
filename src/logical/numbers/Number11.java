package logical.numbers;

            // 1 3 5 7
            // 9 11 13 15
            // 17 19 21 23
            // 25 27 29 31

public class Number11 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                if(num % 2 != 0){
                    System.out.print(num + " ");
                }else{
                    j--;
                }
                num++;
            }
            System.out.println();
        }
    }
}
