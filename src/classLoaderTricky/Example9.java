package classLoaderTricky;

public class Example9 {
    public static void main(String[] args) throws Exception {
        Class.forName("Test7");
    }
}

class Test7{
    static{
        System.out.println("Static block");              //Static block
                                                         //Class.forName() forces initialization
    }
}
