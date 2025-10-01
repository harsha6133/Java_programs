import java.util.ArrayList;

public class consec {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(0);
        al.add(0);
        al.add(0);
        al.add(0);
        al.add(0);
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(1);
        al.add(1);
        int Maxcount=0;
        int count=1;
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)==al.get(i+1)){
                count++;
                // System.out.println(al.get(i)+"-"+al.get(i+1)+"-"+count);
            }
            else{
                if(count>Maxcount)
                {
                    Maxcount=count;
                    count=1;
                }
                count=1;   
            }
        }
        if(count>Maxcount){
            Maxcount=count;
        }
        System.out.println(Maxcount);
    }
    
}
