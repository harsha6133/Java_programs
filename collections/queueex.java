import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class queueex {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue(15,new MyComparator());
        p.offer("A");
        p.offer("Z");
        p.offer("L");
        p.offer("B");
        System.out.println(p);
        

    }
    
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1=(String)obj1;
        String s2=obj2.toString();
        return s2.compareTo(s1);

    }

}
