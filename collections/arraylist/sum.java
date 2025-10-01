import java.util.ArrayList;

public class sum {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(1);
        int target=5;
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.size();j++){
                if((al.get(i)+al.get(j))==target){
                    if(al2.contains(al.get(i))&&al2.contains(al.get(i))){
                        continue;
                    }
                    else{
                        System.out.println(al.get(i)+"-"+al.get(j));
                        al2.add(al.get(i));
                        al2.add(al.get(j));
                        
                    }
                    
                }
            }
        }
    }
    
}
