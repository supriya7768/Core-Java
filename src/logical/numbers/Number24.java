package logical.numbers;

//1 0 1 0 1
//0 0 0 0 0
//1 0 1 0 1
//0 0 0 0 0
//1 0 1 0 1

public class Number24 {
    public static void main(String[] args) {
    for (int i = 1; i <= 5; i++){
        for (int j = 1; j <= 5; j++){
            System.out.print((i*j)%2 + " ");
        }
        System.out.println();
    }
    }
}
