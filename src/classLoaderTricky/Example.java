package classLoaderTricky;

public class Example {

    static{
        System.out.println("Static block");
    }

    static int x =10;

    public static void main(String[] args) {
        Example t = null;
        System.out.println(Example.x);               //Static block
                                                     //10               //Example.x is accessing static variable
    }
}
