package logical.numbers;

            // 2 4 6 8
            // 10 12 14 16
            // 18 20 22 24
            // 26 28 30 32

public class Number12 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4 ; j++) {
                if (num % 2 ==0){
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
