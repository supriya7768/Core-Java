package classLoaderTricky;

public class Example8 {

    public static void main(String[] args) {

        System.out.println(Test6.VALUE);            //Static block
                                                    //100
                                                    //Why Integer is an object not compile-time constant. JVM must initialize the class
    }
}

class Test6{

    static{
        System.out.println("Static block");
    }

    static final Integer VALUE = 100;
}