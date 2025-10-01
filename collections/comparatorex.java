import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer n1=(Integer)obj1;
        Integer n2=(Integer)obj2;
        
        if(n1<n2)
            return 1;
        if(n1>n2)
            return -1;
        else
            return 0;

    }
}
public class comparatorex {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(10);
        t.add(1);
        t.add(100);
        t.add(5);
        System.out.println(t);

        
    }
    
}
