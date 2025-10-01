import java.util.ArrayList;

public class SecondLow {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(20);
        al.add(3);
        al.add(4);
        al.add(5);
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++){
            if(al.get(i)<first){
                second=first;
                first=al.get(i);
            }
            else if(al.get(i)<second && al.get(i)>first){
                second=al.get(i);
            }
        }
        System.out.println("Second Lowest : "+second);

    }
    
}
