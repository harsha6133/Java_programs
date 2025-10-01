import java.util.*;
public class diff {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> union=new HashSet<>();
        HashSet<Integer> intersection=new HashSet<>();
        HashSet<Integer> intersection1=new HashSet<>();
        HashSet<Integer> diff=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs1.add(4);
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);
        hs1.add(8);
        for(int i:hs){
            union.add(i);
        }
        for(int i:hs1){
            if(union.contains(i)){
                continue;
            }
            else{
                union.add(i);
            }
        }
        System.out.println(union);

        for(int i:hs){
            intersection.add(i);
        }
        for(int i:hs1){
            if(intersection.contains(i)){
                intersection1.add(i);
            }
            else{
                intersection.remove(i);
            }
        }
        System.out.println(intersection1);
        for(int i:hs){
            diff.add(i);
        }
        for(int i:hs1){
            if(diff.contains(i)){
                diff.remove(i);
            }
        }
        System.out.println(diff);
    }
    
}
