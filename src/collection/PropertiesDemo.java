package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("src/collection/abc.properties");

        p.load(fis);
        System.out.println(p);    //{name=Java}

        String s = p.getProperty("name");
        System.out.println(s);     //Java

        p.setProperty("surname", "C++");
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("src/collection/abc.properties");
        p.store(fos, "Updated by Supriya");            //This will store the surname property in abc.properties
    }
}
