package logical.numbers;

            // 1
            // 1 2
            // 1 1 1
            // 1 2 3 4

public class Number3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                if(i == 1 || i == 3) {
                    System.out.print("1 ");
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
