import java.util.ArrayList;

public class Arthisum {
    public static void main(String[] args) {
        int n=19;
        int x=12;
        int y=13;

        ArrayList<Integer> al=new ArrayList<>();
        int sum=x;
        for(int i=x;i<=n+x-1;i++){
            if(i==x){
                al.add(x);
            }
            else{
                sum+=y;
                al.add(sum);
            }
            
        }
        System.out.println(al);
        int total=0;
        for(Integer i:al){
            total+=i;
        }

        System.out.println(total);
    }
    
}
