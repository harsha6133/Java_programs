import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        List l2=new ArrayList<>();
        l1.add("harsha");
        l1.add("vardhan");
        l1.add("vamsi");
        l1.add(1,"karthik");
        l2.addAll(l1);
        l1.remove(1);
        l1.set(1, "anil");
        System.out.println(l1.indexOf("anil"));
        System.out.println(l2);
        System.out.println(l1);
        List l3=List.copyOf(l2);
        System.out.println(l3);
                
    }
    
}
