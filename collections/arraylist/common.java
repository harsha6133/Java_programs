import java.util.ArrayList;

public class common {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);
        al1.add(4);
        al2.add(4);
        al2.add(5);
        al2.add(3);
        al2.add(7);
        al2.add(8);
        al2.add(4);
        for(int i:al1){
            for(int j:al2){
                if(i==j){
                    if(al3.contains(i)){
                        continue;
                    }
                    else{
                        al3.add(i);
                    }
                    
                }
            }
        }
        System.out.println(al3);


    }
    
}
