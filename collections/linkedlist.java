import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("harsha");
        l.add(33);
        l.add(null);
        l.set(0, "vamsi");
        l.add(1, "Anil");
        System.out.println(l);
        l.addFirst("karthik");
        l.addLast(69);
        l.remove();
        // l.removeFirst();
        l.remove("Anil");
        System.out.println(l);
        System.out.println(l.peek());
    }
    
}
