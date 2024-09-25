package OOp;

public class Demo {
	
    public static void main(String[] args) {
        int x = 10;
        String s1 = "24";
        Demo demo = new Demo();
        demo.m1(demo);
    }

    private void m1(Demo demo){
        Demo demo2 = demo;
        String s2 = "24";
        String s3 = new String("24");
    }
    
    

}
