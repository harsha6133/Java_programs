import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(11);
        hs.add(12);
        System.out.println(hs);
        hs.remove(11);
        System.out.println(hs);
        hs.add(1);
        hs.add(1000);
        hs.add(-10);
        System.out.println(hs);
    }
    
}
