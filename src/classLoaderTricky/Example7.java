package classLoaderTricky;

public class Example7 {

    public static void main(String[] args) {
        System.out.println(Test5.VALUE);                   //100
                                                           //Static block not executed because static final int VALUE = 100; is a compile time constant
                                                          //Compile replaces Test.VALUE with 100 directly inside bytecode JVM does not need Test.class. No initialization
    }
}

class Test5{

    static{
        System.out.println("Static block");
    }

    static final int VALUE =100;
}
