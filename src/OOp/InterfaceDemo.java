package OOp;

interface Test{
    int x =10;

    default void show(){
        System.out.println("A");
    }
}

interface Test1{
    default void show(){
        System.out.println("B");
    }
}

class InterfaceDemo implements Test, Test1{
    public static void main(String[] args) {
       // x = 20;                               //Compilation error we cannot modify value as interface variable are public, static, final
       // new InterfaceDemo().show();           //Compile time error should override show()
    }

    @Override
    public void show() {
        Test.super.show();
    }
}
