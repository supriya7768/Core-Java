package logical.numbers;

                //0 0 0 0 0
                //1 1 1 1 1
                //0 0 0 0 0
                //1 1 1 1 1
                //0 0 0 0 0

public class Number26 {
    public static void main(String[] args) {
        for (int i = 0; i<=4; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print( i%2 +" ");
            }
            System.out.println();
        }
    }

}
