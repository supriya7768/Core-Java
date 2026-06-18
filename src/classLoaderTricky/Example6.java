package classLoaderTricky;

public class Example6 {

    public static void main(String[] args) {
        Test4.show();
    }
}

class Test4{

    static{
        System.out.println("Static block");            //Static block
                                                       //calling static method is active in use so class get initialized
    }

    static void show(){

    }
}
