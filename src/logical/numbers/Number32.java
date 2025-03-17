package logical.numbers;

        //5
        //4 5
        //3 4 5
        //2 3 4 5
        //1 2 3 4 5

public class Number32 {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--){
            int num = i;
            for (int j = 5; j>=i; j--){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
