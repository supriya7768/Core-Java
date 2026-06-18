package classLoaderTricky;

public class Example3 {

    public static void main(String[] args) {
        Test1 t ;
    }
}

class Test1{

    static {
        System.out.println("Static block");           //Static block does not get executed
                                                      //Test t is only reference declaration no object creation. no Initialization
    }

}
