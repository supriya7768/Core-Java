package classLoaderTricky;

public class Example4 {

    public static void main(String[] args) {
        Test2 t = null;
    }
}

class Test2{
    static {
        System.out.println("Static block");        //Static block does not get executed
                                                   //Only a null reference is created no object creation. no Initialization
    }
}
