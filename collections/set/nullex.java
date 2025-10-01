import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class nullex {
    public static void main(String[] args){
        HashSet hs=new HashSet<>();
        hs.add(null);//Allows one null
        hs.add("a");
        hs.add(null);//ignores second null
        System.out.println(hs);

        LinkedHashSet ls=new LinkedHashSet<>();
        ls.add(null);//Allows one null
        ls.add("h");
        ls.add(null);//ignores second null
        System.out.println(ls);

        TreeSet ts=new TreeSet<>();
        ts.add(null);//Not Allows Null Values Error
        System.out.println(ts);


    }
    
}
