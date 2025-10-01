import java.util.HashSet;

public class samearr {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,7,8};
        int[] arr2={1,2,3,4,5,6};
        HashSet hs1=new HashSet<>();
        for(int i:arr1){
            hs1.add(i);
        }
        HashSet hs2=new HashSet<>();
        for(int i:arr2){
            if(hs1.contains(i)){
                hs2.add(i);
            }
        }
        System.out.println(hs2);
    }
    
}
