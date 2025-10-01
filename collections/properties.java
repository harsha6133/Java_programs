import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class properties {
    public static void main(String[] args)throws Exception {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);
        p.setProperty("harsha", "good boy");
        FileOutputStream fos=new FileOutputStream("abc.properties");
        p.store(fos, "stored by harsha");
    }
    
}
