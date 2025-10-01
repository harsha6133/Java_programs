import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,4,3,2,1};
        List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
        HashSet<Integer> hs=new HashSet<>();
        System.out.println("Original list : "+al);
        for(Integer i:al){
            hs.add(i);
        }
        System.out.println("After Duplicates Removed : "+hs);

        
    }
    
}
