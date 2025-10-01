import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("harsha");
        v.addElement("vardhan");
        v.addElement("lakkoju");
        System.out.println(v);
        System.out.println(v.elementAt(1));
        v.removeElementAt(0);
        System.err.println(v);
    }
    
}
