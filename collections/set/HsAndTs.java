import java.util.*;
public class HsAndTs {
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();
        hs.add(10);
        hs.add(11);
        hs.add(12);
        hs.add(101);
        hs.add(1000);
        hs.add(120);
        System.out.println(hs);//insertion order is not preserved
        ts.add(10);
        ts.add(11);
        ts.add(12);
        ts.add(101);
        ts.add(1000);
        ts.add(120);
        System.out.println(ts);//insertion order is preserved

    }
    
}
