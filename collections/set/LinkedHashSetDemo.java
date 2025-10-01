import java.util.LinkedHashSet;

public class LinkedHashSetDemo{
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(10);
        ls.add(11);
        ls.add(12);
        ls.add(5);
        ls.addFirst(7);
        ls.addLast(1);
        ls.add(10);
        System.out.println(ls);
        ls.remove(10);
        System.out.println(ls);
        ls.removeFirst();
        ls.removeLast();
        System.out.println(ls);
    }
}
