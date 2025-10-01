import java.util.ArrayList;

public class prime {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(17);
        al.add(9);
        al.add(0);
        
        for(int i=0;i<al.size();i++){
            int count=0;
            for(int j=1;j<=al.get(i)/2;j++){
                if(al.get(i)==0){
                    continue;
                }
                else{
                    if((al.get(i))%j==0){
                        count++;
                    }
                }
            }
            if(count==1){
                System.out.println(al.get(i));
            }

        }

    }
    
}
