import java.util.ArrayList;
import java.util.Iterator;

public class iteratorex {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("harsha");
        l.add("vardhan");
        l.add("lakkoju");
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(l);

    }
    
}
