package java_8.functionalInterface;

public interface Functionalnterface {

    //Functional interface can contain default, static, private methods and Object class methods like toString(), hashcode()
    //Only one abstract method is allowed.

    int m1(int a, int b);

    default void defaultMethod(){
        System.out.println("Default method");
    }

    default void defaultMethod2(){
        System.out.println("Default method 2");
    }
}
