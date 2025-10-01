import java.util.ArrayList;
import java.util.Arrays;

public class union {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6};
        Integer[] b={1,2,3,5,6,7,8};
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(a));
        ArrayList<Integer> al2=new ArrayList<>(Arrays.asList(b));
        ArrayList<Integer> al3=new ArrayList<>();
        for(int i=0;i<al1.size();i++){
            if(!al3.contains(al1.get(i))){
                al3.add(al1.get(i));
            }
        }
        for(int i=0;i<al2.size();i++){
            if(!al3.contains(al2.get(i))){
                al3.add(al2.get(i));
            }
        }

        System.out.println(al3);
        
        

        
    }
    
}
