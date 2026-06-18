package classLoaderTricky;

class Test {

    static {
        System.out.println("Static Block");
    }
}

public class Example2 {

    public static void main(String[] args) {

        Class<Test> c = Test.class;               //Static block does not get executed
                                                  //JVM only loades the metadata of class. no active use. No initialization
    }
}
