import java.util.HashMap;

public class weakhashex {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        Temp t=new Temp();
        m.put(t, "harsha");
        System.out.println(m);
        t=null;
        System.gc();
        System.out.println(m.get(t));
        System.out.println('7'-'1');
        
    }
    
}
class Temp{
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}
