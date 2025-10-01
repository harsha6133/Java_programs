import java.util.HashSet;

public class duprem {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        HashSet hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.println(hs);
    }
    
}
