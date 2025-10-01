import java.util.Enumeration;
import java.util.Vector;

public class enumex {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("harsha");
        v.addElement("vardhan");
        v.addElement("lakkoju");
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }    
    }
    
}
