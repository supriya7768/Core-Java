package classLoaderTricky;

public class Example5 {

    public static void main(String[] args) {

        new Test3();
    }
}

class Test3{

    static {
        System.out.println("Static block");         //Static block
                                                    //Here Test object is created
    }
}
